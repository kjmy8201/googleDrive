<template>

    <v-data-table
        :headers="headers"
        :items="dashBoad"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'DashBoadView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
                { text: "isIndexed", value: "isIndexed" },
                { text: "videoUrl", value: "videoUrl" },
                { text: "fileName", value: "fileName" },
                { text: "fileId", value: "fileId" },
            ],
            dashBoad : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/dashBoads'))

            temp.data._embedded.dashBoads.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.dashBoad = temp.data._embedded.dashBoads;
        },
        methods: {
        }
    }
</script>

