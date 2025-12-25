import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'

// 本地开发时将 /api 代理到后端
export default defineConfig({
  plugins: [vue()],
  server: {
    port: 5173,
    proxy: {
      '/api': {
        target: 'http://localhost:8080',
        changeOrigin: true,
        secure: false
      }
    }
  }
})
