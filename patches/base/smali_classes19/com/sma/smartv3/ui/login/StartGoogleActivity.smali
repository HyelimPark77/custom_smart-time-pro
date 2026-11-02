.class public final Lcom/sma/smartv3/ui/login/StartGoogleActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nStartGoogleActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartGoogleActivity.kt\ncom/sma/smartv3/ui/login/StartGoogleActivity\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,170:1\n183#2,4:171\n196#2:183\n252#3,7:175\n270#3:182\n*S KotlinDebug\n*F\n+ 1 StartGoogleActivity.kt\ncom/sma/smartv3/ui/login/StartGoogleActivity\n*L\n128#1:171,4\n128#1:183\n128#1:175,7\n128#1:182\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nStartGoogleActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartGoogleActivity.kt\ncom/sma/smartv3/ui/login/StartGoogleActivity\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,170:1\n183#2,4:171\n196#2:183\n252#3,7:175\n270#3:182\n*S KotlinDebug\n*F\n+ 1 StartGoogleActivity.kt\ncom/sma/smartv3/ui/login/StartGoogleActivity\n*L\n128#1:171,4\n128#1:183\n128#1:175,7\n128#1:182\n*E\n"
    }
.end annotation


# instance fields
.field private final QQRl$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final faceBookRl$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final googleRl$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final rv$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final thirdPartyCallback:Lcom/sma/smartv3/ui/login/StartGoogleActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final twitterRl$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final weChatRl$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final weiBoRl$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    const-string v0, "StartGoogleActivity"

    iput-object v0, p0, Lcom/sma/smartv3/ui/login/StartGoogleActivity;->TAG:Ljava/lang/String;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/y75;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/y75;-><init>(Lcom/sma/smartv3/ui/login/StartGoogleActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/login/StartGoogleActivity;->rv$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/z75;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/z75;-><init>(Lcom/sma/smartv3/ui/login/StartGoogleActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/login/StartGoogleActivity;->weChatRl$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/a85;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/a85;-><init>(Lcom/sma/smartv3/ui/login/StartGoogleActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/login/StartGoogleActivity;->QQRl$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/b85;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/b85;-><init>(Lcom/sma/smartv3/ui/login/StartGoogleActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/login/StartGoogleActivity;->weiBoRl$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/c85;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/c85;-><init>(Lcom/sma/smartv3/ui/login/StartGoogleActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/login/StartGoogleActivity;->faceBookRl$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/d85;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/d85;-><init>(Lcom/sma/smartv3/ui/login/StartGoogleActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/login/StartGoogleActivity;->twitterRl$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/e85;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/e85;-><init>(Lcom/sma/smartv3/ui/login/StartGoogleActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/login/StartGoogleActivity;->googleRl$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/sma/smartv3/ui/login/StartGoogleActivity$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/login/StartGoogleActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/login/StartGoogleActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/login/StartGoogleActivity;->thirdPartyCallback:Lcom/sma/smartv3/ui/login/StartGoogleActivity$OXO1;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/login/StartGoogleActivity;)Landroid/widget/RelativeLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/login/StartGoogleActivity;->weiBoRl_delegate$lambda$0(Lcom/sma/smartv3/ui/login/StartGoogleActivity;)Landroid/widget/RelativeLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/login/StartGoogleActivity;)Landroidx/core/widget/NestedScrollView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/login/StartGoogleActivity;->rv_delegate$lambda$0(Lcom/sma/smartv3/ui/login/StartGoogleActivity;)Landroidx/core/widget/NestedScrollView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/login/StartGoogleActivity;)Landroid/widget/RelativeLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/login/StartGoogleActivity;->twitterRl_delegate$lambda$0(Lcom/sma/smartv3/ui/login/StartGoogleActivity;)Landroid/widget/RelativeLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/login/StartGoogleActivity;)Landroid/widget/RelativeLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/login/StartGoogleActivity;->QQRl_delegate$lambda$0(Lcom/sma/smartv3/ui/login/StartGoogleActivity;)Landroid/widget/RelativeLayout;

    move-result-object p0

    return-object p0
.end method

.method private static final QQRl_delegate$lambda$0(Lcom/sma/smartv3/ui/login/StartGoogleActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    const v0, 0x7f0a000e

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/login/StartGoogleActivity;)Landroid/widget/RelativeLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/login/StartGoogleActivity;->faceBookRl_delegate$lambda$0(Lcom/sma/smartv3/ui/login/StartGoogleActivity;)Landroid/widget/RelativeLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/login/StartGoogleActivity;)Landroid/widget/RelativeLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/login/StartGoogleActivity;->weChatRl_delegate$lambda$0(Lcom/sma/smartv3/ui/login/StartGoogleActivity;)Landroid/widget/RelativeLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/login/StartGoogleActivity;)Landroid/widget/RelativeLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/login/StartGoogleActivity;->googleRl_delegate$lambda$0(Lcom/sma/smartv3/ui/login/StartGoogleActivity;)Landroid/widget/RelativeLayout;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$thirdPartyLogin(Lcom/sma/smartv3/ui/login/StartGoogleActivity;Lcom/sma/androidthirdpartylogin/model/LoginResponse;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/login/StartGoogleActivity;->thirdPartyLogin(Lcom/sma/androidthirdpartylogin/model/LoginResponse;)V

    return-void
.end method

.method private static final faceBookRl_delegate$lambda$0(Lcom/sma/smartv3/ui/login/StartGoogleActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    const v0, 0x7f0a03bf

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method private static final googleRl_delegate$lambda$0(Lcom/sma/smartv3/ui/login/StartGoogleActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    const v0, 0x7f0a0420

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method private static final rv_delegate$lambda$0(Lcom/sma/smartv3/ui/login/StartGoogleActivity;)Landroidx/core/widget/NestedScrollView;
    .locals 1

    const v0, 0x7f0a09c1

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/core/widget/NestedScrollView;

    return-object p0
.end method

.method private final thirdPartyLogin(Lcom/sma/androidthirdpartylogin/model/LoginResponse;)V
    .locals 9

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-virtual {p1}, Lcom/sma/androidthirdpartylogin/model/LoginResponse;->I0IIOi()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/sma/androidthirdpartylogin/model/LoginResponse;->XOO0ii0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/sma/androidthirdpartylogin/model/LoginResponse;->iO()Ljava/lang/String;

    move-result-object v3

    const/16 v7, 0x38

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lcom/sma/smartv3/network/RequestBodyKt;->getThirdPartyBody$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/HashMap;

    move-result-object p1

    new-instance v1, Lcom/sma/smartv3/ui/login/StartGoogleActivity$thirdPartyLogin$1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/login/StartGoogleActivity$thirdPartyLogin$1;-><init>(Lcom/sma/smartv3/ui/login/StartGoogleActivity;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/login/StartGoogleActivity;->getRv()Landroidx/core/widget/NestedScrollView;

    move-result-object v2

    invoke-virtual {v0, p0, v2}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v2

    sget-object v3, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v3}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v3

    const-string v4, "/appuser/signin_third_party"

    invoke-virtual {v0, v3, v4}, Lcom/sma/smartv3/network/NetWorkUtils;->convertBaseUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5, p1}, Lcom/sma/smartv3/network/NetWorkUtils;->printParam(Ljava/lang/String;Ljava/util/Map;)V

    sget-object v0, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Lcom/sma/smartv3/ui/login/StartGoogleActivity$thirdPartyLogin$$inlined$post$1;

    invoke-direct {v3, p0, v1, v2}, Lcom/sma/smartv3/ui/login/StartGoogleActivity$thirdPartyLogin$$inlined$post$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {v0}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    sget-object v0, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/reflect/Type;

    const-class v1, Lcom/sma/smartv3/model/AppUser;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lcom/sma/androidnetworklib/model/Response;

    invoke-static {v1, v0}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/login/StartGoogleActivity$thirdPartyLogin$$inlined$post$2;

    invoke-direct {v1, v3}, Lcom/sma/smartv3/ui/login/StartGoogleActivity$thirdPartyLogin$$inlined$post$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {p1, v0, v1}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method private static final twitterRl_delegate$lambda$0(Lcom/sma/smartv3/ui/login/StartGoogleActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    const v0, 0x7f0a18ce

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method private static final weChatRl_delegate$lambda$0(Lcom/sma/smartv3/ui/login/StartGoogleActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    const v0, 0x7f0a1918

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method private static final weiBoRl_delegate$lambda$0(Lcom/sma/smartv3/ui/login/StartGoogleActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    const v0, 0x7f0a1938

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/RelativeLayout;

    return-object p0
.end method


# virtual methods
.method public final emailLogin(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "View"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i72;->i10X0X0i(Landroid/app/Activity;)V

    return-void
.end method

.method public final faceBook(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "View"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/iXI0OOOIi;->OXO1:Lcom/android/mltcode/paycertificationapi/iXI0OOOIi;

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/StartGoogleActivity;->thirdPartyCallback:Lcom/sma/smartv3/ui/login/StartGoogleActivity$OXO1;

    invoke-virtual {p1, p0, v0}, Lcom/android/mltcode/paycertificationapi/iXI0OOOIi;->XIi00iiXO(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/wq5;)V

    return-void
.end method

.method public final getFaceBookRl()Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/StartGoogleActivity;->faceBookRl$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method public final getGoogleRl()Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/StartGoogleActivity;->googleRl$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method public final getQQRl()Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/StartGoogleActivity;->QQRl$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method public final getRv()Landroidx/core/widget/NestedScrollView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/StartGoogleActivity;->rv$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/core/widget/NestedScrollView;

    return-object v0
.end method

.method public final getTwitterRl()Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/StartGoogleActivity;->twitterRl$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method public final getWeChatRl()Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/StartGoogleActivity;->weChatRl$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method public final getWeiBoRl()Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/StartGoogleActivity;->weiBoRl$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method public final google(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "View"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i0I01iiO0;->OXO1:Lcom/android/mltcode/paycertificationapi/i0I01iiO0;

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/StartGoogleActivity;->thirdPartyCallback:Lcom/sma/smartv3/ui/login/StartGoogleActivity$OXO1;

    invoke-virtual {p1, p0, v0}, Lcom/android/mltcode/paycertificationapi/i0I01iiO0;->XO0O10(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/wq5;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/login/StartGoogleActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " google : clientID = "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public initView()V
    .locals 10

    sget-object v0, Lcom/android/mltcode/paycertificationapi/iXI0OOOIi;->OXO1:Lcom/android/mltcode/paycertificationapi/iXI0OOOIi;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    const-string v2, "getApplication(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/iXI0OOOIi;->OXO1(Landroid/content/Context;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/cy6;->OXO1:Lcom/android/mltcode/paycertificationapi/cy6;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/cy6;->OXO1(Landroid/content/Context;)V

    sget-object v3, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/login/StartGoogleActivity;->getWeChatRl()Landroid/widget/RelativeLayout;

    move-result-object v4

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/login/StartGoogleActivity;->getQQRl()Landroid/widget/RelativeLayout;

    move-result-object v5

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/login/StartGoogleActivity;->getWeiBoRl()Landroid/widget/RelativeLayout;

    move-result-object v6

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/login/StartGoogleActivity;->getFaceBookRl()Landroid/widget/RelativeLayout;

    move-result-object v7

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/login/StartGoogleActivity;->getTwitterRl()Landroid/widget/RelativeLayout;

    move-result-object v8

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/login/StartGoogleActivity;->getGoogleRl()Landroid/widget/RelativeLayout;

    move-result-object v9

    invoke-virtual/range {v3 .. v9}, Lcom/android/mltcode/paycertificationapi/i72;->OOIIOX(Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d011e

    return v0
.end method

.method public final noLogin(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "View"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "noLogin"

    invoke-static {v0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1
    .param p3    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/iXI0OOOIi;->OXO1:Lcom/android/mltcode/paycertificationapi/iXI0OOOIi;

    invoke-virtual {v0, p1, p2, p3}, Lcom/android/mltcode/paycertificationapi/iXI0OOOIi;->iO(IILandroid/content/Intent;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i0I01iiO0;->OXO1:Lcom/android/mltcode/paycertificationapi/i0I01iiO0;

    invoke-virtual {v0, p1, p3}, Lcom/android/mltcode/paycertificationapi/i0I01iiO0;->O00(ILandroid/content/Intent;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/ga2;->OXO1:Lcom/android/mltcode/paycertificationapi/ga2;

    invoke-virtual {v0, p1, p2, p3}, Lcom/android/mltcode/paycertificationapi/ga2;->XIi00iiXO(IILandroid/content/Intent;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/cy6;->OXO1:Lcom/android/mltcode/paycertificationapi/cy6;

    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/android/mltcode/paycertificationapi/cy6;->iO(Landroid/app/Activity;IILandroid/content/Intent;)V

    return-void
.end method

.method public final onEmailLoginDone(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "ALREADY_LOGIN"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void
.end method

.method public final onThirdPartyLogin(Lcom/sma/androidthirdpartylogin/model/LoginResponse;)V
    .locals 1
    .param p1    # Lcom/sma/androidthirdpartylogin/model/LoginResponse;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "third_party_login_response"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/login/StartGoogleActivity;->thirdPartyLogin(Lcom/sma/androidthirdpartylogin/model/LoginResponse;)V

    return-void
.end method

.method public final qq(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "View"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/xq5;->OXO1:Lcom/android/mltcode/paycertificationapi/xq5;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/xq5;->XIi00iiXO(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lcom/android/mltcode/paycertificationapi/ga2;->OXO1:Lcom/android/mltcode/paycertificationapi/ga2;

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/StartGoogleActivity;->thirdPartyCallback:Lcom/sma/smartv3/ui/login/StartGoogleActivity$OXO1;

    invoke-virtual {p1, p0, v0}, Lcom/android/mltcode/paycertificationapi/ga2;->OXO1(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/wq5;)V

    return-void

    :cond_0
    const p1, 0x7f1402ea

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void
.end method

.method public final twitter(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "View"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "twitter"

    invoke-static {v0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final weChat(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/lq6;->OXO1:Lcom/android/mltcode/paycertificationapi/lq6;

    invoke-virtual {p1, p0}, Lcom/android/mltcode/paycertificationapi/lq6;->OXO1(Landroid/content/Context;)V

    return-void
.end method

.method public final weiBo(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "View"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/cy6;->OXO1:Lcom/android/mltcode/paycertificationapi/cy6;

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/StartGoogleActivity;->thirdPartyCallback:Lcom/sma/smartv3/ui/login/StartGoogleActivity$OXO1;

    invoke-virtual {p1, p0, v0}, Lcom/android/mltcode/paycertificationapi/cy6;->XIi00iiXO(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/wq5;)V

    return-void
.end method
