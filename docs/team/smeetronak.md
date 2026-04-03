# Project Portfolio: Smeet Ronak

## Project: CCAManager
CCAManager is a CLI-based application designed for Hall Leaders to manage Resident CCA
records, track event participation, and analyze performance points efficiently.

---

## Summary of Contributions

### 1. Exception Handling
* **Custom Exceptions:** Defined and implemented custom exception classes to handle
  invalid inputs and illegal operations (e.g. referencing non-existent residents or CCAs),
  ensuring the application never crashes on bad input.
* **Consistent Error Messaging:** Ensured all commands return clear, user-friendly error
  messages by catching exceptions at the appropriate level across all command classes.

### 2. Input Parsing
* **Parser Design:** Modified the `Parser` class responsible for tokenising raw CLI input,
  identifying the command keyword, and routing parsed arguments to the correct command handler.
* **Robustness:** Handled edge cases such as missing arguments, extra whitespace, and
  unrecognised commands gracefully without crashing the application.
* **Extensibility:** Designed the parser to be easily extensible, allowing teammates to
  add new commands with minimal changes to existing parsing logic.

### 3. Data Storage
* **Persistence Layer:** Implemented the data storage system that saves and restores all
  application data — residents, CCAs, events, and participation records — across sessions.
* **Data Integrity:** Handled edge cases such as missing or corrupted save files, ensuring
  the application recovers gracefully without data loss.
* **Decoupled Design:** Kept the storage layer separate from business logic so that changes
  to either side do not cascade across the codebase.

---