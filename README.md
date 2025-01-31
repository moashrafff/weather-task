
## Key Features

- **Responsive UI:** Utilizes Jetpack Compose to create a responsive user interface that adapts to various screen sizes and orientations.
- **MVVM Architecture:** Follows the Model-View-ViewModel architectural pattern for a modular and maintainable codebase.
- **Modularization:** Codebase is organized into modular components for improved scalability, maintainability, and code separation.
- **Tablet Support:** Optimized for tablet devices, providing a seamless user experience on larger screens.
- **Offline Mode:** Allows the app to function in offline mode, displaying the last saved weather data when the internet is not available.
- **Dependency Injection:** Utilizes Dagger Hilt for efficient and clean dependency injection, promoting code organization and testability.
- **JSON Serialization:** Employs Gson for seamless JSON serialization and deserialization, facilitating smooth communication with the Weather.com API.
- **API Calls with Retrofit:** Uses Retrofit for making API calls to the Weather.com API, fetching real-time weather information.
- **Local Data Storage:** Implements Room as a local database management system, storing and retrieving data for efficient offline functionality.
- **Image Caching:** Integrates Coil for image loading and caching, enhancing performance when displaying weather-related images.
- **Portrait and Landscape Support:** Ensures a consistent and visually appealing user experience in both portrait and landscape orientations.
- Add Dark/Light theme feature.


## Tech Stack

#### Core

- 100% [Kotlin](https://kotlinlang.org/)
- 100% [Jetpack Compose](https://developer.android.com/jetpack/compose)
- [Material3 design](https://m3.material.io/) (UI components)
- [Kotlin Coroutines](https://kotlinlang.org/docs/coroutines-overview.html) (structured concurrency)
- [Kotlin Flow](https://kotlinlang.org/docs/flow.html) (reactive datastream)
- [Hilt](https://dagger.dev/hilt/) (DI)
- [Coil](https://coil-kt.github.io/coil/) (Image caching)
- [CI/CD] Github actions

#### Local Persistence
- [Room DB](https://developer.android.com/training/data-storage/room) (SQLite ORM)

#### Networking
- [Retrofit](https://square.github.io/retrofit/) (REST client)
- [Gson Serialization](https://github.com/google/gson) (JSON serialization)

### API
- [Weather API](https://www.weatherapi.com/)


## TODOs (Feel free to contribute)
- unit test and intrumented test

