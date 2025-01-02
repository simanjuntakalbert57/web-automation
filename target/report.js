$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Checkout.feature");
    formatter.feature({
      "name": "fungsi Checkout",
      "description": "  Description: Kami akan menguji beberapa skenario menerapkan Tes E2E pada web site https://www.saucedemo.com/ mengunakan cucumber, testng , dan jenkins ",
      "keyword": "Feature"
    });
    formatter.scenario({
      "name": "Sebagai pengguna saya dapat Checkout benar (positive case)",
      "description": "",
      "keyword": "Scenario",
      "tags": [
        {
          "name": "@Sprint2B"
        },
        {
          "name": "@TestCase4"
        }
      ]
    });
    formatter.before({
      "status": "passed"
    });
    formatter.step({
      "name": "Diberikan  user akses halaman \"https://www.saucedemo.com/\"",
      "keyword": "Given "
    });
    formatter.match({
      "location": "stepdefenitions.LoginStepDefenition.diberikan_user_akses_halaman_saucedemo_com(java.lang.String)"
    });
    formatter.result({
      "status": "passed"
    });
    formatter.step({
      "name": "Ketika user di dalaman user dapat melihat \"Swag Labs\"",
      "keyword": "When "
    });
    formatter.match({
      "location": "stepdefenitions.LoginStepDefenition.ketika_user_di_dalaman_user_dapat_melihat(java.lang.String)"
    });
    formatter.result({
      "status": "passed"
    });
    formatter.step({
      "name": "Dan user memasukan UserName \"standard_user\"",
      "keyword": "And "
    });
    formatter.match({
      "location": "stepdefenitions.LoginStepDefenition.dan_user_memasukan_UserName(java.lang.String)"
    });
    formatter.result({
      "status": "passed"
    });
    formatter.step({
      "name": "Dan user memasukan password \"secret_sauce\"",
      "keyword": "And "
    });
    formatter.match({
      "location": "stepdefenitions.LoginStepDefenition.dan_user_memasukan_password(java.lang.String)"
    });
    formatter.result({
      "status": "passed"
    });
    formatter.step({
      "name": "Dan user menekan tombol login",
      "keyword": "And "
    });
    formatter.match({
      "location": "stepdefenitions.LoginStepDefenition.dan_user_mmenekan_tombol_login()"
    });
    formatter.result({
      "status": "passed"
    });
    formatter.step({
      "name": "Dan user memilih barang sauce labs backpack dan barang sauce labs bike light",
      "keyword": "And "
    });
    formatter.match({
      "location": "stepdefenitions.CheckoutDefenition.dan_user_memilih_barang_sauce_labs_backpack_dan_barang_sauce_labs_bike_light()"
    });
    formatter.result({
      "status": "passed"
    });
    formatter.step({
      "name": "Dan user menekan tombol keranjang",
      "keyword": "And "
    });
    formatter.match({
      "location": "stepdefenitions.CheckoutDefenition.dan_user_menekan_tombol_keranjang()"
    });
    formatter.result({
      "status": "passed"
    });
    formatter.step({
      "name": "Dan user menekan tombol checkout",
      "keyword": "And "
    });
    formatter.match({
      "location": "stepdefenitions.CheckoutDefenition.dan_user_menekan_tombol_checkout()"
    });
    formatter.result({
      "status": "passed"
    });
    formatter.step({
      "name": "Dan user memasukan nama depan \"Muhammad\" dan nama belakang \" Ramadhan\" dan kode pos \"12345\" dan menekan tombol continue",
      "keyword": "And "
    });
    formatter.match({
      "location": "stepdefenitions.CheckoutDefenition.dan_user_memasukan_nama_depan_dan_nama_belakang_dan_kode_pos_dan_menekan_tombol_continue(java.lang.String,java.lang.String,java.lang.String)"
    });
    formatter.result({
      "status": "passed"
    });
    formatter.step({
      "name": "Dan user menekan tombol finish",
      "keyword": "And "
    });
    formatter.match({
      "location": "stepdefenitions.CheckoutDefenition.dan_user_menekan_tombol_finish()"
    });
    formatter.result({
      "status": "passed"
    });
    formatter.step({
      "name": "Maka user dapat melihat pemberitahuan \"Thank you for your order!\"",
      "keyword": "Then "
    });
    formatter.match({
      "location": "stepdefenitions.CheckoutDefenition.maka_user_dapat_melihat_pemberitahuan(java.lang.String)"
    });
    formatter.result({
      "status": "passed"
    });
    formatter.after({
      "status": "passed"
    });
    formatter.uri("file:src/test/resources/features/Filter.feature");
    formatter.feature({
      "name": "fungsi filter",
      "description": "  Description: Kami akan menguji beberapa skenario menerapkan Tes E2E pada web site https://www.saucedemo.com/ mengunakan cucumber, testng , dan jenkins ",
      "keyword": "Feature"
    });
    formatter.scenario({
      "name": "Sebagai pengguna saya dapat memfilter dengan benar (positive case)",
      "description": "",
      "keyword": "Scenario",
      "tags": [
        {
          "name": "@Sprint2B"
        },
        {
          "name": "@TestCase3"
        }
      ]
    });
    formatter.before({
      "status": "passed"
    });
    formatter.step({
      "name": "Diberikan  user akses halaman \"https://www.saucedemo.com/\"",
      "keyword": "Given "
    });
    formatter.match({
      "location": "stepdefenitions.LoginStepDefenition.diberikan_user_akses_halaman_saucedemo_com(java.lang.String)"
    });
    formatter.result({
      "status": "passed"
    });
    formatter.step({
      "name": "Ketika user di dalaman user dapat melihat \"Swag Labs\"",
      "keyword": "When "
    });
    formatter.match({
      "location": "stepdefenitions.LoginStepDefenition.ketika_user_di_dalaman_user_dapat_melihat(java.lang.String)"
    });
    formatter.result({
      "status": "passed"
    });
    formatter.step({
      "name": "Dan user memasukan UserName \"standard_user\"",
      "keyword": "And "
    });
    formatter.match({
      "location": "stepdefenitions.LoginStepDefenition.dan_user_memasukan_UserName(java.lang.String)"
    });
    formatter.result({
      "status": "passed"
    });
    formatter.step({
      "name": "Dan user memasukan password \"secret_sauce\"",
      "keyword": "And "
    });
    formatter.match({
      "location": "stepdefenitions.LoginStepDefenition.dan_user_memasukan_password(java.lang.String)"
    });
    formatter.result({
      "status": "passed"
    });
    formatter.step({
      "name": "Dan user menekan tombol login",
      "keyword": "And "
    });
    formatter.match({
      "location": "stepdefenitions.LoginStepDefenition.dan_user_mmenekan_tombol_login()"
    });
    formatter.result({
      "status": "passed"
    });
    formatter.step({
      "name": "Dan user melakukan pengurutan Z ke A mengunakan fitur filter",
      "keyword": "And "
    });
    formatter.match({
      "location": "stepdefenitions.FilterStepDefenition.dan_user_melakukan_pengurutan_Z_ke_A_mengunakan_fitur_filter()"
    });
    formatter.result({
      "status": "passed"
    });
    formatter.step({
      "name": "Maka user dapat melihat pengurutan \"Name (Z to A)\"",
      "keyword": "Then "
    });
    formatter.match({
      "location": "stepdefenitions.FilterStepDefenition.maka_user_dapat_melihat_pengurutan(java.lang.String)"
    });
    formatter.result({
      "status": "passed"
    });
    formatter.after({
      "status": "passed"
    });
    formatter.uri("file:src/test/resources/features/Login.feature");
    formatter.feature({
      "name": "fungsi login",
      "description": "  Description: Kami akan menguji beberapa skenario menerapkan Tes E2E pada web site https://www.saucedemo.com/ mengunakan cucumber, testng , dan jenkins ",
      "keyword": "Feature"
    });
    formatter.scenario({
      "name": "Sebagai pengguna saya dapat login dengan benar (positive case)",
      "description": "",
      "keyword": "Scenario",
      "tags": [
        {
          "name": "@Sprint2B"
        },
        {
          "name": "@TestCase1"
        }
      ]
    });
    formatter.before({
      "status": "passed"
    });
    formatter.step({
      "name": "Diberikan  user akses halaman \"https://www.saucedemo.com/\"",
      "keyword": "Given "
    });
    formatter.match({
      "location": "stepdefenitions.LoginStepDefenition.diberikan_user_akses_halaman_saucedemo_com(java.lang.String)"
    });
    formatter.result({
      "status": "passed"
    });
    formatter.step({
      "name": "Ketika user di dalaman user dapat melihat \"Swag Labs\"",
      "keyword": "When "
    });
    formatter.match({
      "location": "stepdefenitions.LoginStepDefenition.ketika_user_di_dalaman_user_dapat_melihat(java.lang.String)"
    });
    formatter.result({
      "status": "passed"
    });
    formatter.step({
      "name": "Dan user memasukan UserName \"standard_user\"",
      "keyword": "And "
    });
    formatter.match({
      "location": "stepdefenitions.LoginStepDefenition.dan_user_memasukan_UserName(java.lang.String)"
    });
    formatter.result({
      "status": "passed"
    });
    formatter.step({
      "name": "Dan user memasukan password \"secret_sauce\"",
      "keyword": "And "
    });
    formatter.match({
      "location": "stepdefenitions.LoginStepDefenition.dan_user_memasukan_password(java.lang.String)"
    });
    formatter.result({
      "status": "passed"
    });
    formatter.step({
      "name": "Dan user menekan tombol login",
      "keyword": "And "
    });
    formatter.match({
      "location": "stepdefenitions.LoginStepDefenition.dan_user_mmenekan_tombol_login()"
    });
    formatter.result({
      "status": "passed"
    });
    formatter.step({
      "name": "Maka user dapat melihat \"Products\"",
      "keyword": "Then "
    });
    formatter.match({
      "location": "stepdefenitions.LoginStepDefenition.maka_user_dapat_melihat(java.lang.String)"
    });
    formatter.result({
      "status": "passed"
    });
    formatter.after({
      "status": "passed"
    });
    formatter.scenario({
      "name": "Sebagai pengguna saya mendapatkan peringatan jika salah input saat login (negative case)",
      "description": "",
      "keyword": "Scenario",
      "tags": [
        {
          "name": "@Sprint2B"
        },
        {
          "name": "@TestCase2"
        }
      ]
    });
    formatter.before({
      "status": "passed"
    });
    formatter.step({
      "name": "Diberikan  user akses halaman \"https://www.saucedemo.com/\"",
      "keyword": "Given "
    });
    formatter.match({
      "location": "stepdefenitions.LoginStepDefenition.diberikan_user_akses_halaman_saucedemo_com(java.lang.String)"
    });
    formatter.result({
      "status": "passed"
    });
    formatter.step({
      "name": "Ketika user di dalaman user dapat melihat \"Swag Labs\"",
      "keyword": "When "
    });
    formatter.match({
      "location": "stepdefenitions.LoginStepDefenition.ketika_user_di_dalaman_user_dapat_melihat(java.lang.String)"
    });
    formatter.result({
      "status": "passed"
    });
    formatter.step({
      "name": "Dan user memasukan UserName \"standard_user1\"",
      "keyword": "And "
    });
    formatter.match({
      "location": "stepdefenitions.LoginStepDefenition.dan_user_memasukan_UserName(java.lang.String)"
    });
    formatter.result({
      "status": "passed"
    });
    formatter.step({
      "name": "Dan user memasukan password \"secret_sauce\"",
      "keyword": "And "
    });
    formatter.match({
      "location": "stepdefenitions.LoginStepDefenition.dan_user_memasukan_password(java.lang.String)"
    });
    formatter.result({
      "status": "passed"
    });
    formatter.step({
      "name": "Dan user menekan tombol login",
      "keyword": "And "
    });
    formatter.match({
      "location": "stepdefenitions.LoginStepDefenition.dan_user_mmenekan_tombol_login()"
    });
    formatter.result({
      "status": "passed"
    });
    formatter.step({
      "name": "Maka user dapat melihat \"Epic sadface: Username and password do not match any user in this service\"",
      "keyword": "Then "
    });
    formatter.match({
      "location": "stepdefenitions.LoginStepDefenition.maka_user_dapat_melihat(java.lang.String)"
    });
    formatter.result({
      "status": "passed"
    });
    formatter.after({
      "status": "passed"
    });
    });