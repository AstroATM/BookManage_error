// ヘッダーメニュー
$(window).on("scroll", function () {
  $("header").css("left", -$(window).scrollLeft());
});

$(".burger").click(function () {
  $(this).toggleClass('active');
});

$(".openbtn-area").click(function () {//ボタンがクリックされたら
  $(this).toggleClass('active');//ボタン自身に activeクラスを付与し
  $("#g-nav").toggleClass('panelactive');//ナビゲーションにpanelactiveクラスを付与
  $(".circle-bg").toggleClass('circleactive');//丸背景にcircleactiveクラスを付与
  $("body").toggleClass("noScroll");
});

$("#g-nav a").click(function () {//ナビゲーションのリンクがクリックされたら
  $(".openbtn-area").removeClass('active');//ボタンの activeクラスを除去し
  $("#g-nav").removeClass('panelactive');//ナビゲーションのpanelactiveクラスを除去
  $(".circle-bg").removeClass('circleactive');//丸背景のcircleactiveクラスを除去
  $("body").removeClass("noScroll");
});


$( '.js-input' ).keyup(function() {
  if( $(this).val() ) {
    $(this).addClass('not-empty');
  } else {
    $(this).removeClass('not-empty');
  }
});