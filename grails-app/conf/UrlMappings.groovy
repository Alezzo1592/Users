class UrlMappings {

	static mappings = {
       "/users"(controller: "users",action: "save")
        "/users/$id"(controller: "users",action: "get")
        "/"(view:"/index")
        "500"(view:'/error')
	}
}
