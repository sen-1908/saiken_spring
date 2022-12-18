<template>
  <div>
    {{ item }}
  </div>
</template>

<script>
import axios from 'axios'
export default {
  data () {
    return {
      item: []
    }
  },
  methods: {
    getItem () {
      const path = 'http://localhost:8888/items'
      axios.get(path)
        .then(response => {
          this.item = response.data
        })
        .catch(error => {
          console.log(error)
        })
    }
  },
  created () {
    this.getItem()
  }
}
</script>