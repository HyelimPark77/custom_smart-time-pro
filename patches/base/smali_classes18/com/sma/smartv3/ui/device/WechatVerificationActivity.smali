.class public final Lcom/sma/smartv3/ui/device/WechatVerificationActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private final mBtnActive$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mSquareVerificationCodeView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/zx6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/zx6;-><init>(Lcom/sma/smartv3/ui/device/WechatVerificationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/WechatVerificationActivity;->mBtnActive$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ay6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ay6;-><init>(Lcom/sma/smartv3/ui/device/WechatVerificationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/WechatVerificationActivity;->mSquareVerificationCodeView$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/WechatVerificationActivity;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/WechatVerificationActivity;->mBtnActive_delegate$lambda$0(Lcom/sma/smartv3/ui/device/WechatVerificationActivity;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/WechatVerificationActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/WechatVerificationActivity;->initView$lambda$0(Lcom/sma/smartv3/ui/device/WechatVerificationActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/WechatVerificationActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/WechatVerificationActivity;->initView$lambda$0$0(Lcom/sma/smartv3/ui/device/WechatVerificationActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/WechatVerificationActivity;)Lcom/sma/smartv3/view/SquareVerificationCodeView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/WechatVerificationActivity;->mSquareVerificationCodeView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/WechatVerificationActivity;)Lcom/sma/smartv3/view/SquareVerificationCodeView;

    move-result-object p0

    return-object p0
.end method

.method private final getMBtnActive()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/WechatVerificationActivity;->mBtnActive$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method private final getMSquareVerificationCodeView()Lcom/sma/smartv3/view/SquareVerificationCodeView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/WechatVerificationActivity;->mSquareVerificationCodeView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/SquareVerificationCodeView;

    return-object v0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/device/WechatVerificationActivity;Landroid/view/View;)V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WechatVerificationActivity;->getMSquareVerificationCodeView()Lcom/sma/smartv3/view/SquareVerificationCodeView;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Lcom/sma/smartv3/biz/wx/WxManager;->OXO1:Lcom/sma/smartv3/biz/wx/WxManager;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/xx6;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/xx6;-><init>(Lcom/sma/smartv3/ui/device/WechatVerificationActivity;)V

    invoke-virtual {v0, p1, v1}, Lcom/sma/smartv3/biz/wx/WxManager;->iXi(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    :cond_0
    return-void
.end method

.method private static final initView$lambda$0$0(Lcom/sma/smartv3/ui/device/WechatVerificationActivity;Z)Lkotlin/Unit;
    .locals 1

    if-eqz p1, :cond_0

    const p1, 0x7f1412e1

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onHandleBackPressed()V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final mBtnActive_delegate$lambda$0(Lcom/sma/smartv3/ui/device/WechatVerificationActivity;)Landroid/widget/Button;
    .locals 1

    const v0, 0x7f0a01b9

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private static final mSquareVerificationCodeView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/WechatVerificationActivity;)Lcom/sma/smartv3/view/SquareVerificationCodeView;
    .locals 1

    const v0, 0x7f0a0261

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/SquareVerificationCodeView;

    return-object p0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initView()V
    .locals 2

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f1400f6

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WechatVerificationActivity;->getMBtnActive()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/yx6;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/yx6;-><init>(Lcom/sma/smartv3/ui/device/WechatVerificationActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0144

    return v0
.end method

.method public onDestroy()V
    .locals 0

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    return-void
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final onTitleRightClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i0O111;->OXO1:Lcom/android/mltcode/paycertificationapi/i0O111;

    invoke-virtual {p1, p0}, Lcom/android/mltcode/paycertificationapi/i0O111;->i010I(Landroid/app/Activity;)V

    return-void
.end method
