pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "MovieSearch"
include(":app")
include(":feature:movie:data")
include(":feature:movie:domain")
include(":feature:movie:ui")
include(":feature:movie_details:data")
include(":feature:movie_details:domain")
include(":feature:movie_details:ui")
include(":core:network")
include(":core:common")
include(":core:feature_api")
