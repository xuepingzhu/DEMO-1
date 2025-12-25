<template>
  <div class="detail">
    <button class="close" @click="$emit('close')">关闭 ✕</button>
    <div class="detail-inner">
      <img :src="product.imageUrl" :alt="product.name" />
      <div class="info">
        <h2>{{ product.name }}</h2>
        <p class="price">¥{{ product.price.toFixed(2) }}</p>
        <p class="desc">{{ product.description }}</p>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  props: {
    product: { type: Object, required: true }
  }
}
</script>
