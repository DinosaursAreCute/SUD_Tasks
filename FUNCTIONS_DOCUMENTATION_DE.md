# SUD_Tasks: Detaillierte Funktionsdokumentation

Dieses Dokument bietet einen umfassenden Überblick über alle Klassen und Funktionen im SUD_Tasks-Repository.

---

## Inhaltsverzeichnis
- [Mitarbeiter-Modul](#mitarbeiter-modul)
- [Formen-Modul](#formen-modul)
- [Fahrzeug-Modul](#fahrzeug-modul)
- [Testklassen](#testklassen)
- [Allgemeine Hinweise](#allgemeine-hinweise)

---

## Mitarbeiter-Modul

### Department.java
- **Department(String name, Manager head)**: Konstruktor. Erstellt eine Abteilung mit einem Namen und einem Manager als Leiter.
- **void addEmployee(Employee e)**: Fügt einen Mitarbeiter zur Abteilung hinzu.
- **boolean removeEmployee(Employee e)**: Entfernt einen Mitarbeiter aus der Abteilung.
- **Manager changeHead(Manager newHead)**: Wechselt den Abteilungsleiter zu einem neuen Manager.
- **double getTotalIncome()**: Gibt die Gesamtkosten für die Gehälter aller Mitarbeiter in der Abteilung zurück.
- **List<Employee> getEmployees()**: Gibt eine Liste aller Mitarbeiter in der Abteilung zurück.
- **String getEmployeeList()**: Gibt eine Zeichenkette mit allen Mitarbeitern zurück.

### Driver.java
- **Driver(int id, String name, double hourlyRate, DriverLicense license)**: Konstruktor. Erstellt einen Fahrer mit einer ID, einem Namen, einem Stundenlohn und einer Lizenz.
- **DriverLicense getLicense()**: Gibt die Fahrerlaubnis zurück.

### Employee.java (abstrakt)
- **Employee(int id, String name)**: Konstruktor. Erstellt einen Mitarbeiter mit einer ID und einem Namen.
- **int getId()**: Gibt die ID des Mitarbeiters zurück.
- **String getName()**: Gibt den Namen des Mitarbeiters zurück.
- **double getSalary()**: Gibt das Gehalt des Mitarbeiters zurück (in Unterklassen implementiert).

### EmployeeManagement.java
- **void addEmployee(Employee e)**: Fügt einen Mitarbeiter zum Verwaltungssystem hinzu.
- **void addDepartment(Department d)**: Fügt eine Abteilung zum Verwaltungssystem hinzu.
- **void workDay()**: Simuliert einen Arbeitstag für alle Mitarbeiter.

### Manager.java
- (Konstruktor und Methoden ähnlich wie bei Employee, mit Bonusverwaltung.)

### OfficeWorker.java
- **OfficeWorker(int id, String name, double fixedSalary)**: Konstruktor. Erstellt einen Büroangestellten.
- **double getSalary()**: Gibt das feste Gehalt zurück.

### ShiftWorker.java
- **void work()**: Erhöht die gearbeiteten Stunden um 8.
- **void work(int hours)**: Erhöht die gearbeiteten Stunden um eine angegebene Anzahl.

---

## Formen-Modul

Jede Formklasse (z. B. Circle, Cone, Cuboid, Cylinder, Rectangle, RegularPrism, RegularPyramid, Sphere) enthält:
- Konstruktoren für jede Form mit den entsprechenden Parametern (z. B. Radius, Höhe).
- Methoden zur Berechnung von Fläche, Volumen und anderen geometrischen Eigenschaften.

---

## Fahrzeug-Modul

### Bus.java
- **void setDriver(Driver driver)**: Weist dem Bus einen Fahrer zu.

### FleetManagement.java
- **void addVehicle(Vehicle v)**: Fügt ein Fahrzeug zur Flotte hinzu.

### GPSPosition.java
- **void setPosition(double longitude, double latitude)**: Setzt die GPS-Position.

### Truck.java
- **void load(double area)**: Lädt Fracht.
- **void unload(double area)**: Entlädt Fracht.
- **void setDriver(Driver driver)**: Weist dem LKW einen Fahrer zu.

---

## Testklassen

Alle Testklassen (z. B. TestDepartment.java, TestEmployee.java, TestShapes.java, TestVehicle.java) enthalten:
- **public static void main(String[] args)**: Einstiegspunkt für das Ausführen von Tests und Demonstrationen der Hauptmodule.

---

## Allgemeine Hinweise
- Alle Klassen folgen den Standard-Java-Konventionen und sind thematisch organisiert.
- Abstrakte Klassen und Schnittstellen werden für Erweiterbarkeit und Code-Wiederverwendung verwendet.
- Testklassen bieten einfache Demonstrationen und können direkt ausgeführt werden.

---

Wenn du mehr Details zu einer bestimmten Klasse oder Funktion benötigst, sieh dir den Quellcode an oder fordere eine detaillierte Erklärung an.
