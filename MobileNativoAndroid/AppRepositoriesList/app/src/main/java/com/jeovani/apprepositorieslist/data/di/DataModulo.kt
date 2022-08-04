package com.jeovani.apprepositorieslist.data.di

import android.util.Log
import com.google.gson.GsonBuilder
import com.jeovani.apprepositorieslist.data.repositories.RepoRepositories
import com.jeovani.apprepositorieslist.data.repositories.RepoRepositoryImpl
import com.jeovani.apprepositorieslist.data.service.GitHubService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object DataModulo {

    private const val OK_HTTP = "OkHttp"

    fun load(){
        loadKoinModules(netWorkModules() + repositoriesModule())
    }

    private fun netWorkModules(): Module {
        return module {
            single {
                val interceptor = HttpLoggingInterceptor {
                    Log.e(OK_HTTP, it)
                }
                interceptor.level = HttpLoggingInterceptor.Level.BODY

                OkHttpClient.Builder()
                    .addInterceptor(interceptor)
                    .build()
            }

            single {
                GsonConverterFactory.create(GsonBuilder().create())
            }

            single {
                createService<GitHubService>(get(), get())
            }
        }
    }

    private fun repositoriesModule(): Module {
        return module {
            single<RepoRepositories> {
                RepoRepositoryImpl(get())
            }
        }
    }

    private inline fun <reified T> createService(client: OkHttpClient, factory: GsonConverterFactory): T {
        return Retrofit.Builder()
            .baseUrl("http://api.github.com/")
            .client(client)
            .addConverterFactory(factory)
            .build().create(T::class.java)
    }
}