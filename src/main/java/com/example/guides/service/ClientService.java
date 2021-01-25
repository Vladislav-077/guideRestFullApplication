package com.example.guides.service;

import com.example.guides.model.Client;

import java.util.List;

public interface ClientService {

    /**
     * Создаем нового клиента
     *
     * @param client - клиент для создания
     */

    void crate(Client client);

    /**
     * Возвращает список всех созданных клиентов
     *
     * @return - список клиентов
     */

    List<Client> readAll();

    /**
     * Возвращает клиента по его ID
     *
     * @param id - ID клиента
     * @return - объект клиента с заданым ID
     */

    Client read(int id);

    /**
     * Обновляет клиента с заданным ID в соответсвии с переданным клиентом
     *
     * @param client - клиент в соответсвии с которым нужно обновть данные
     * @param id     - ID клиента которого нужно обновить
     * @return - true елси данные были обновленны успешно иначе false
     */

    boolean update(Client client, int id);

    /**
     * Удаляет клиента с заданным ID
     *
     * @param id - ID клиента, которого нужно удалить
     * @return - true если клиент был удален успешно, иначе false
     */

    boolean delete(int id);

}
