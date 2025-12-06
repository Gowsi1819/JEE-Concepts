
**Memory rule**

GET asks → POST acts

URL for get

[localhost:8083/JEE_Servlet1/CallingServlet?username=demo&password=demo%40123](http://localhost:8083/JEE_Servlet1/CallingServlet?username=demo&password=demo%40123)

URL for post

[localhost:8083/JEE_Servlet1/CallingServlet](http://localhost:8083/JEE_Servlet1/CallingServlet)


## ✅ `doGet()` – Summary

- Handles **HTTP GET** requests
- **Can send data**, but via **URL parameters**
- Data is used for **retrieving / filtering data**
- **Does not change server state**
- Data is **visible** in URL
- Suitable for **search, view, fetch operations**
- Default method if `method` is not specified in form
- Called **indirectly by `service()`**

---

## ✅ `doPost()` – Summary

- Handles **HTTP POST** requests
- **Can send data**, via **request body**
- Data is used for **processing / storing / updating data**
- **Changes server state**
- Data is **not visible** in URL
- Suitable for **login, registration, insert/update operations**
- Used for **sensitive or large data**
- Called **indirectly by `service()`**


  ## `doGet()` vs `doPost()` – Main Difference Points

- **Purpose**:
    
    `doGet()` is used to **retrieve data**, while `doPost()` is used to **process or store data**.
    
- **Data Transfer**:
    
    `doGet()` sends data through the **URL**, whereas `doPost()` sends data in the **request body**.
    
- **Visibility & Security**:
    
    Data in `doGet()` is **visible** in the URL; data in `doPost()` is **not visible**.
    
- **Server State**:
    
    `doGet()` **does not change** server state, while `doPost()` **changes** server state.


  If the method attribute is not specified in an HTML form, the default method is GET. When a request reaches the servlet, the container calls the service method of HttpServlet, which checks the HTTP method and internally dispatches the request to either doGet or doPost.


  When you override doPost(), you are not removing service().
The container calls service(), and service() internally calls doPost() for POST requests.


