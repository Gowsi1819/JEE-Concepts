**Diagram**


<img width="536" height="504" alt="image" src="https://github.com/user-attachments/assets/175b4c8e-30f1-4f03-b226-e91f060fb38a" />



**Explanation:**

The HTML page sends a request that is mapped via web.xml to a servlet, and the servlet interacts with PostgreSQL through the JDBC driver(PostgreSQL jar) to process and store data.

**How is data sent to a servlet?**

Data is sent to a servlet when the client submits a request from an HTML page. The browser packages the form data into an HTTP request. Tomcat receives this request, processes it through Coyote and the servlet container, and makes the data available to the servlet via the HttpServletRequest object.
