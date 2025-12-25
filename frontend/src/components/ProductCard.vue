<template>
  <div class="card" @click="$emit('click')">
    <img :src="product.imageUrl" :alt="product.name" />
    <div class="card-body">
      <h3>{{ product.name }}</h3>
      <p class="price">¥{{ product.price.toFixed(2) }}</p>
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
