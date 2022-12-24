
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);



import DashBoadView from "./components/DashBoadView"
import DashBoadViewDetail from "./components/DashBoadViewDetail"
import FileManager from "./components/listers/FileCards"
import FileDetail from "./components/listers/FileDetail"

import IndexManager from "./components/listers/IndexCards"
import IndexDetail from "./components/listers/IndexDetail"

import VideoManager from "./components/listers/VideoCards"
import VideoDetail from "./components/listers/VideoDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [

            {
                path: '/dashBoads',
                name: 'DashBoadView',
                component: DashBoadView
            },
            {
                path: '/dashBoads/:id',
                name: 'DashBoadViewDetail',
                component: DashBoadViewDetail
            },
            {
                path: '/files',
                name: 'FileManager',
                component: FileManager
            },
            {
                path: '/files/:id',
                name: 'FileDetail',
                component: FileDetail
            },

            {
                path: '/indices',
                name: 'IndexManager',
                component: IndexManager
            },
            {
                path: '/indices/:id',
                name: 'IndexDetail',
                component: IndexDetail
            },

            {
                path: '/videos',
                name: 'VideoManager',
                component: VideoManager
            },
            {
                path: '/videos/:id',
                name: 'VideoDetail',
                component: VideoDetail
            },




    ]
})
