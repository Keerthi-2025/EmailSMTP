**What is Email SMTP?**

SMTP (Simple Mail Transfer Protocol) is the standard protocol used for sending emails across the internet. When an application or mail client wants to send an email, it uses an SMTP server to deliver the message to the recipient’s mail server.

In the context of a Spring Boot application, SMTP acts as the bridge between your application and the email service provider (e.g., Gmail, Outlook, Yahoo).
Your application sends the email request → SMTP server processes and routes it → email reaches the recipient.

---

**🧩 How SMTP Works** 

Your Application prepares an email message using SMTP settings (host, port, username, password).

The message is sent to an SMTP server (for example: smtp.gmail.com).

The SMTP server authenticates your credentials.

If authentication succeeds, the server queues or forwards the email to the recipient’s mail server.

The recipient’s server delivers the email to the user’s inbox through POP3/IMAP. 

---

# 📧 SMTP Email Configuration (Gmail) – Spring Boot

To enable email sending through Gmail’s SMTP server in your **Spring Boot** application, add the following properties to your `application.properties` (or `application.yml`) file:

```properties
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=your-email@gmail.com
spring.mail.password=your-app-password

spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
```

---

## 🔐 Generate a Gmail App Password (Recommended for SMTP)

### **Prerequisite**

You must have **2-Step Verification** enabled on your Google account.

---

## **Steps to Generate App Password**

### 1️⃣ Open Google Account Security Settings

🔗 [https://myaccount.google.com/security](https://myaccount.google.com/security)

### 2️⃣ Turn on **2-Step Verification**

### 3️⃣ After activating, return to the **Security** page

### 4️⃣ Click **App passwords**

### 5️⃣ In the dropdowns, select:

* **App:** Mail
* **Device:** Other → type your application name

### 6️⃣ Click **Generate**

### 7️⃣ Copy the **16-character password**

### 8️⃣ Use this generated password as:

```
spring.mail.password=your-app-password
```




