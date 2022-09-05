package com.mariosplen.drivertest.di

import android.content.Context
import androidx.room.Room
import com.mariosplen.drivertest.data.DriverTestDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {


	@Singleton
	@Provides
	fun provideDatabase(
		@ApplicationContext context: Context
	) = Room.databaseBuilder(
		context,
		DriverTestDatabase::class.java,
		"testdriver.db"
	).createFromAsset("database/drivertest.db")
		.build()


	@Singleton
	@Provides
	fun provideDao(database: DriverTestDatabase) = database.driverTestDao()


}