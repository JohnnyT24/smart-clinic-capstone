# Smart Clinic Database Schema

## Tables

### doctors
- id (PK)
- name
- specialty

### patients
- id (PK)
- name
- dob

### appointments
- id (PK)
- doctor_id (FK)
- patient_id (FK)
- appointment_date

### prescriptions
- id (PK)
- patient_id (FK)
- medication

### users
- id (PK)
- username
- password
- role
