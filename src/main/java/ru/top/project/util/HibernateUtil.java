package ru.top.project.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import ru.top.project.model.User;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();
                configuration.setProperty("hibernate.connection.driver_class", "com.postgresql.jdbc.Driver");
                configuration.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/postgres");
                configuration.setProperty("hibernate.connection.username", "postgres");
                configuration.setProperty("hibernate.connection.password", "123");

                // Указание диалекта базы данных
                configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.postgresSQL");

                // Указание, нужно ли показывать SQL запросы
                configuration.setProperty("hibernate.show_sql", "true");

                // Указание, нужно ли форматировать SQL запросы
                configuration.setProperty("hibernate.format_sql", "true");

                // Добавление классов сущностей
                configuration.addAnnotatedClass(User.class);


                // Создание реестра сервисов
                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();

                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }

}
