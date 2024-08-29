# TaskMgmtSystem
Task Management System using Java(21), Spring Boot(3.3.3), Hibernate, PostgreSQL


<!-- Improved compatibility of back to top link: See: https://github.com/othneildrew/Best-README-Template/pull/73 -->
<a name="readme-top"></a>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#releases">Releases</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
### Task Management System

- A Task Management System to keep track of all the tasks.
- User will be able to see the progress of each task.
- User will be able to assign a task, mark a task complete, in progress, or completed. 

<p align="right">(<a href="#readme-top">back to top</a>)</p>



### Built With

* [![Java][Java]][Java-url]
* [![Spring Boot][SpringBoot]][springboot-url]

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- GETTING STARTED -->
## Getting Started

To get a local copy up and running follow these simple steps.

### Prerequisites
You need to install ```PostreSQL```, and ```Java 21```.

* PostgreSQL

    You can dowload PostreSQL from the below link depending on the OS you have. 
    ```
    https://www.postgresql.org/download/
    ```

* Spring Tool Suite (STS) [Optional]

    You can dowload Spring Tool Suite from the below link depending on the OS you have. 
    ```
    https://spring.io/tools
    ```

* Postman (For testing the APIs)

    You can dowload Postman from the below link depending on the OS you have. 
    ```
    https://www.postman.com/downloads/
    ```  

### Installation

#### 1. Clone the Repository
* **Clone Locally:** Use a terminal or Git client to clone the repository to your desired location on your local system.

#### 2. Import as Maven Projects
* **Open Eclipse/Spring Tool Suite:** Launch your preferred IDE.
* **Import Maven Project:**
  * Navigate to `File` > `Import`.
  * Select `Maven` > `Existing Maven Projects`.
  * **Select Root Directory:** Browse to the root directory of your cloned TMS repository.
  * **Check Projects:** Ensure the desired modules (TMS, commons, tms-user-service) are checked.
  * **Click Finish:** Complete the import process.

#### 3. Import Modules in Order
* **Import TMS:** Import the `TMS` module first.
* **Import commons:** Import the `commons` module, selecting the `TMS` project as the workspace. This ensures proper dependency resolution.
* **Import tms-user-service:** Import the `tms-user-service` module, again selecting `TMS` as the workspace.

**Note:** If you encounter any dependency issues, double-check your Maven configuration and ensure that the necessary dependencies are defined in the `pom.xml` files of each module.



<!-- USAGE EXAMPLES -->
<!-- ## Usage
Here is a sample screen of the application

- [login-view-screenshot]
- [search-view-screenshot]
- [dashboard-view-screenshot]

<p align="right">(<a href="#readme-top">back to top</a>)</p> -->



<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- ROADMAP -->
## Roadmap

- [x] User Service API
- [ ] Task Service API
- [ ] Activity Service API
- [ ] Integration of API gateway with Spring Cloud
- [ ] Authentication with JWT

<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE.txt` for more information.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Releases

### v1
- User service API


<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- CONTACT -->
## Contact

[Nilesh](https://www.linkedin.com/in/nilesh-suryawanshi1168/) - n.suryawanshi1168@gmail.com

Project Link: [https://github.com/nilesh1168/flixed-movie-tracker](https://github.com/nilesh1168/TaskMgmtSystem)

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- ACKNOWLEDGMENTS -->
## Acknowledgments

<!-- * [OMDB API](https://www.omdbapi.com/) -->
* [Best Readme Template](https://github.com/othneildrew/Best-README-Template/blob/master/README.md?plain=1)
* [Choose an Open Source License](https://choosealicense.com)
* [GitHub Emoji Cheat Sheet](https://www.webpagefx.com/tools/emoji-cheat-sheet)
* [Img Shields](https://shields.io)
* [Font Awesome](https://fontawesome.com)
<!-- * [React Icons](https://react-icons.github.io/react-icons/search) -->
<!-- * [gunicorn on macOS](https://chat.openai.com/share/e3ae209a-1ce0-48c9-85f2-c78dca9c6911) -->
<!-- * [What is NGINX? and how to set it up on Mac.](https://medium.com/@VenuThomas/what-is-nginx-and-how-to-set-it-up-on-mac-107a2482a33a) -->
<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[SpringBoot]: https://img.shields.io/badge/Spring%20Boot-springboot?style=for-the-badge&logo=springboot&color=white
[springboot-url]: https://spring.io/projects/spring-boot
[Java]: https://img.shields.io/badge/Java-java?style=for-the-badge&color=red
[Java-url]: https://www.java.com/en/
<!-- [login-view-screenshot]: /documentation/login-screen.png
[search-view-screenshot]: /documentation/search.png
[dashboard-view-screenshot]: /documentation/dashboard.png -->