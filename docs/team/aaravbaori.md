# Project Portfolio: Aarav Baori

## Project: CCALedger
CCALedger is a CLI-based application designed for Hall Leaders to manage Resident CCA records, track leadership roles (Exco), and analyze event participation efficiently.

---

## Summary of Contributions

### 1. Code Contributed
[Repo Analysis Link: [[Link to your Code]](https://nus-cs2113-ay2526-s2.github.io/tp-dashboard/?search=aarav&sort=groupTitle&sortWithin=title&timeframe=commit&mergegroup=&groupSelect=groupByRepos&breakdown=true&checkedFileTypes=docs~functional-code~test-code~other&since=2026-02-20T00%3A00%3A00&filteredFileName=&tabOpen=true&tabType=authorship&tabAuthor=AaravBaori&tabRepo=AY2526S2-CS2113-W13-1%2Ftp%5Bmaster%5D&authorshipIsMergeGroup=false&authorshipFileTypes=docs~functional-code~test-code&authorshipIsBinaryFileTypeChecked=false&authorshipIsIgnoredFilesChecked=false)]

### 2. Enhancements Implemented
* **System Architecture & Base Implementation (v1.0):** * **What it is:** Designed and implemented the core skeleton and logic loop of the project.
    * **Justification:** This served as the foundation for the entire team, allowing for parallel development. It ensured that basic command execution and state management were robust from Day 1.
    * **Depth:** Required deep consideration of the **Command Pattern** to ensure the project remained extensible for future milestones.
* **Exco Management & Feature Upgrades (v2.0):** * **Feature:** Developed the `AddExcoToEventCommand` and `ViewExcoCommand`.
    * **Implementation:** Introduced a specialized tracking system for leadership roles, distinguishing between general members and executive committee members.
* **Enumeration-Based Input System:** * **Enhancement:** Refactored the CCA input logic to utilize **Java Enums** instead of raw Strings.
    * **Depth:** This was a significant defensive programming upgrade. It prevented data corruption by restricting user inputs to predefined valid categories, eliminating a large class of potential runtime errors.
* **Critical Parsing Bug Fixes:** * **Issue:** Identified several edge-case parsing bugs in the CLI handler where certain symbol combinations caused the program to crash.
    * **Solution:** Curated a standardized input-sanitization solution that bolstered the application's stability during v2.0 integration.

### 3. Contributions to the User Guide (UG)
* Authored the documentation for **Exco Management**, including detailed syntax guides for `add-exco-to-cca` and `view-exco`.
* Created and integrated visual workflow diagrams to illustrate how leaders can effectively monitor student participation.

### 4. Contributions to the Developer Guide (DG)
* **Architecture Diagram:** Designed the high-level **UML Architecture Diagram** for the `CCALedger` profile, illustrating the relationship between `UI`, `Logic`, `Model`, and `Storage`.
* **Feature Diagrams:** Added sequence diagrams for the `add-exco-to-cca` and `view-exco` commands to visualize object interactions.
* **Design Rationale:** Documented the transition to Enumerations and the architectural benefits of the core skeleton established in v1.0.

### 5. Contributions to Team-Based Tasks
* **Technical Leadership:** As the architect of the v1.0 base, I provided technical guidance to teammates on how to integrate their features into the core logic without causing regression bugs.
* **Quality Assurance:** Acted as the primary "bug hunter" during the v2.0 integration phase, focusing specifically on the Parser and input validation.
* **Project Management:** Ensured consistent code standards across the repository by reviewing PRs related to core logic.
