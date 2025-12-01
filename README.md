📧 SMTP Email Configuration (Gmail) – Spring Boot

To enable email sending through Gmail's SMTP server in your Spring Boot application, add the following properties to your application.properties (or application.yml) file:


Generate a Gmail App Password (Recommended for SMTP)
Prerequisite:

You must have 2-Step Verification enabled on your Google account.

**Steps:**

**Open Google Account Security Settings**
https://myaccount.google.com/security

Turn on 2-Step Verification.

After activating, go back to the Security page.

Click App passwords.

Select:

App: Mail

Device: Other → type your application name

Click Generate.

Copy the 16-character password.

Use this as spring.mail.password.

```

# Gmail SMTP configuration
export SPRING_MAIL_HOST="smtp.gmail.com"
export SPRING_MAIL_PORT=587
export SPRING_MAIL_USERNAME="your-email@gmail.com"
export SPRING_MAIL_PASSWORD="your-app-password"

export SPRING_MAIL_PROPERTIES_MAIL_SMTP_AUTH=true
export SPRING_MAIL_PROPERTIES_MAIL_SMTP_STARTTLS_ENABLE=true

echo "Gmail SMTP environment variables configured."



