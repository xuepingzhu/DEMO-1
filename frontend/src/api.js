const base = '/api/products'

export async function fetchProducts() {
  const res = await fetch(base)
  if (!res.ok) throw new Error('Failed to fetch products')
  return res.json()
}

export async function fetchProduct(id) {
  const res = await fetch(`${base}/${id}`)
  if (!res.ok) throw new Error('Product not found')
  return res.json()
}
