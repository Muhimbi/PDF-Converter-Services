require 'test_helper'

class HomeControllerTest < ActionController::TestCase
  test "should get upload_file" do
    get :upload_file
    assert_response :success
  end

end
