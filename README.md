📧 SMTP Email Configuration (Gmail) – Spring Boot

To enable email sending through Gmail's SMTP server in your Spring Boot application, add the following properties to your application.properties (or application.yml) file:

```

# Gmail SMTP configuration
export SPRING_MAIL_HOST="smtp.gmail.com"
export SPRING_MAIL_PORT=587
export SPRING_MAIL_USERNAME="your-email@gmail.com"
export SPRING_MAIL_PASSWORD="your-app-password"

export SPRING_MAIL_PROPERTIES_MAIL_SMTP_AUTH=true
export SPRING_MAIL_PROPERTIES_MAIL_SMTP_STARTTLS_ENABLE=true

echo "Gmail SMTP environment variables configured."



