### Aufgabe: Erstellen einer Konsolenanwendung mit Spring Boot

### Aufgabenverwaltungssystem

#### Anforderungsspezifikation

  
 **Konsolenanwendung:**
    - Die Anwendung soll im Terminal laufen und eine einfache Menüstruktur bieten.
    - Das Menü sollte die folgenden Optionen bieten:
      1. Aufgabe hinzufügen
      2. Aufgaben anzeigen
      3. Aufgabe löschen
      4. Anwendung beenden

1. **Task-Klasse:**
    - Erstellen Sie eine Klasse `Task` mit den folgenden Attributen:
        - `id` (automatisch generiert)
        - `title`
        - `description`
    - Fügen Sie Konstruktoren, Getter und Setter hinzu.

2. **Service-Klasse:**
    - Erstellen Sie eine Service-Klasse `TaskService` mit den folgenden Methoden:
        - `addTask(Task task)` - Fügt eine neue Aufgabe hinzu.
        - `getAllTasks()` - Gibt alle Aufgaben zurück.
        - `deleteTask(int id)` - Löscht eine Aufgabe anhand der ID.

5. **Benutzerinteraktion:**
    - Erstellen Sie eine Klasse `ConsoleApp` mit einer `main`-Methode, die das Hauptmenü der Anwendung startet.
    - Implementieren Sie die Logik für die Benutzerinteraktion:
        - Erfassen Sie Benutzereingaben für die verschiedenen Menüoptionen.
        - Verwenden Sie den `TaskService` für die Verwaltung der Aufgaben.

6. **Spring-Konfiguration:**
    - Verwenden Sie Spring Boot für die Konfiguration und Initialisierung der Beans.
    - Integrieren Sie die Anwendung mit Spring, um Dependency Injection für den `TaskService` zu ermöglichen.

#### Hinweise zur Implementierung

- **Projektstruktur:**
    ```
    com.example.cli
    ├── ConsoleApp.java
    ├── Task.java
    ├── TaskService.java
    ```

