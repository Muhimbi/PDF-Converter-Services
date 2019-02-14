MuhimbiPDFConverter::Application.routes.draw do
  get "home/upload_file"
  post "home/upload_file"
  root :to => 'home#upload_file'
end
