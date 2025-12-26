<template>
  <div class="container">
    <header>
      <h1>水杯产品展示</h1>
      <p class="subtitle">Vue 3 + JavaScript 前端 —— Java (Spring Boot) 后端</p>
    </header>

    <main>
      <ProductList @select="onSelect" />
      <ProductDetail v-if="selected" :product="selected" @close="selected = null" />
    </main>

    <footer>
      <small>示例项目 · 开发环境111</small>
    </footer>
  </div>
</template>

<script>
import ProductList from './components/ProductList.vue'
import ProductDetail from './components/ProductDetail.vue'

export default {
  components: { ProductList, ProductDetail },
  data() {
    return { selected: null }
  },
  methods: {
    onSelect(product) {
      this.selected = product
    }
  }
}
</script>
