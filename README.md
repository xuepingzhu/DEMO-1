# Water Cup Showcase (示例)

这是一个示例项目，前端使用 Vue 3 + Vite（JavaScript），后端使用 Spring Boot（Java）。演示如何展示水杯产品列表与详情，并通过 REST API 提供数据。

目录结构（示例）
- frontend/            # Vue3 前端（开发服务器：5173）
- backend/             # Spring Boot 后端（端口：8080）

快速运行（开发模式）
1. 后端：
   cd backend
   mvn spring-boot:run
   （需要安装 JDK 17+ 和 Maven）

2. 前端：
   cd frontend
   npm install
   npm run dev
   打开 http://localhost:5173

构建生产版本（示例）
- 前端：
  cd frontend
  npm run build
  产物在 frontend/dist，可以部署到任意静态站点托管或复制到后端静态目录。

- 后端：
  cd backend
  mvn package
  java -jar target/backend-0.0.1-SNAPSHOT.jar

API
- GET /api/products            -> 返回产品列表
- GET /api/products/{id}       -> 返回单个产品（若不存在返回 404）

说明
- 开发时前端通过 Vite 的 proxy 将 /api 转发到后端（http://localhost:8080）
- 后端在 Controller 上允许跨域（只允许本地开发来源）

你可以根据需要扩展：持久化（数据库）、增加管理面板、图片上传等。
