# Unwork Health Absence

학생이 진단서를 직접 발급·촬영·업로드하지 않아도
제휴 병원의 진료 완료 정보가 학교로 전달되어
보건결석 처리가 이루어지는 서비스입니다.

## 핵심 사용자

1. 학생
2. 병원
3. 학교

## 핵심 흐름

병원 QR 스캔
→ 학생 인증 및 정보 제공 동의
→ Visit Session 생성
→ 병원 진료 완료
→ 진료 인증
→ 학교 시스템 전달
→ 처리 완료

## Frontend

Next.js 기반 단일 웹 애플리케이션을 사용합니다.

```text
/student
/hospital
/university
```

* `/student`: 학생 인증 및 진료 상태 확인
* `/hospital`: 병원 진료 인증
* `/university`: 학교 보건결석 처리 상태 확인

## Backend

Spring Boot REST API

주요 역할:

1. 사용자 인증
2. QR 토큰 생성
3. QR 토큰 검증
4. 병원 진료 인증 이벤트 수신
5. 학교 시스템 전달
6. 상태 변경 및 조회

## Database

PostgreSQL

## Repository Structure

```text
unwork-health-absence/
├─ frontend/
│  └─ web/
├─ backend/
│  └─ spring-server/
├─ docs/
│  ├─ architecture.md
│  ├─ api.md
│  └─ db-schema.md
├─ docker-compose.yml
├─ README.md
└─ .gitignore
```

## Development

기능 개발은 `main` 브랜치에서 직접 작업하지 않고 별도의 기능 브랜치를 생성해서 진행합니다.

예:

```text
feature/student-page
feature/hospital-page
feature/backend-auth
feature/qr-api
```

작업 완료 후 Pull Request를 통해 `main`에 병합합니다.
