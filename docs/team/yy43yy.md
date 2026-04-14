# Yi Yang - Project Portfolio Page

## Project: CCAManager
CCAManager is a CLI-based application for Hall Leaders to manage Resident CCA records, track event participation, and analyze performance points.

---

## Summary of Contributions

### 1. Delete Resident Feature
* **Implementation:** Developed `DeleteResidentCommand` for removing residents by matric number.
* **Validation:** Handled errors for non-existent residents and empty lists.

### 2. View Points Feature
* **Implementation:** Created `ViewPointsCommand` to display total CCA points and breakdown.
* **Logic:** Accurate point calculation using resident and CCA records.

### 3. View CCA Events Feature
* **Implementation:** Developed `ViewCcaEventsCommand` to display events for a specific CCA.
* **Error Handling:** Managed cases with no events or non-existing CCAs.

### 4. View My Events Feature
* **Implementation:** Built `ViewMyEventsCommand` for residents to view their event participation.

### 5. Update Points Feature
* **Implementation:** Created `UpdateCcaPointCommand` to update a resident’s points for a CCA.
* **Validation:** Ensured non-negative points and verified CCA/resident existence.

### 6. Sort Points Feature
* **Implementation:** Developed `SortPointsCommand` to sort residents by total points in descending order.

### 7. Testing & Quality Assurance
* **Unit Testing:** Wrote tests for `DeleteResidentCommand`, `ViewPointsCommand`, `ViewCcaEventsCommand`, and `ViewMyEventsCommand`.
* **Edge Cases:** Tested invalid inputs, empty lists, and error handling.

---

## Contributions to the User Guide
* Wrote instructions for `view-points`, `view-cca-events`, `view-my-events`, `sort-points`, `edit-points`.

## Contributions to the Developer Guide
* Documented implementation for key commands: `DeleteResidentCommand`, `ViewPointsCommand`, `ViewCcaEventsCommand`, `UpdateCcaPointCommand`, `ViewMyEventsCommand`, `SortPointsCommand`.
* Explained design and execution flow for resident and event handling.

---

## Contributions to the Team Project

### Feature Development
* Led development of commands for resident management, point tracking, and event viewing.

### Code Quality & Collaboration
* Ensured consistency with project architecture and coding style.
* Collaborated on feature integration across different managers.

---

## Summary
* Implemented core features for resident and event management, including deletion, viewing points, and sorting.
* Contributed unit tests for reliability.
* Enhanced user experience with clear data presentation.