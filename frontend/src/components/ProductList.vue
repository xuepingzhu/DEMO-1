<template>
  <section>
    <div class="controls">
      <input v-model="query" placeholder="搜索产品名..." />
    </div>

    <div v-if="loading" class="loading">加载中...</div>
    <div v-if="error" class="error">{{ error }}</div>

    <div class="grid">
      <ProductCard
        v-for="p in filtered"
        :key="p.id"
        :product="p"
        @click="select(p)"
      />
    </div>
  </section>
</template>

<script>
import { fetchProducts } from '../api'
import ProductCard from './ProductCard.vue'

export default {
  components: { ProductCard },
  data() {
    return {
      products: [],
      loading: true,
      error: null,
      query: ''
    }
  },
  computed: {
    filtered() {
      const q = this.query.trim().toLowerCase()
      if (!q) return this.products
      return this.products.filter(p => p.name.toLowerCase().includes(q))
    }
  },
  async mounted() {
    try {
      this.products = await fetchProducts()
    } catch (e) {
      this.error = e.message
    } finally {
      this.loading = false
    }
  },
  methods: {
    select(product) {
      this.$emit('select', product)
    }
  }
}
</script>
