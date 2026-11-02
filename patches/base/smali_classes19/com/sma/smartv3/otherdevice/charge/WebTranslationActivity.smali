.class public final Lcom/sma/smartv3/otherdevice/charge/WebTranslationActivity;
.super Lcom/sma/smartv3/ui/me/WebViewActivity;
.source "SourceFile"


# instance fields
.field private final abhTitleRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public mAITranslationUrl:Lcom/sma/smartv3/model/AITranslationUrl;

.field private final mTitleLayout$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/WebViewActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/rw6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/rw6;-><init>(Lcom/sma/smartv3/otherdevice/charge/WebTranslationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/WebTranslationActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/sw6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/sw6;-><init>(Lcom/sma/smartv3/otherdevice/charge/WebTranslationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/WebTranslationActivity;->mTitleLayout$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/otherdevice/charge/WebTranslationActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/WebTranslationActivity;->mTitleLayout_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/WebTranslationActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/otherdevice/charge/WebTranslationActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/WebTranslationActivity;->abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/WebTranslationActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method private static final abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/WebTranslationActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method public static final synthetic access$share(Lcom/sma/smartv3/otherdevice/charge/WebTranslationActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/WebTranslationActivity;->share()V

    return-void
.end method

.method private final getAbhTitleRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/WebTranslationActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getMTitleLayout()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/WebTranslationActivity;->mTitleLayout$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private static final mTitleLayout_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/WebTranslationActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0022

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final share()V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.SEND"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "text/plain"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/WebTranslationActivity;->getMAITranslationUrl()Lcom/sma/smartv3/model/AITranslationUrl;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AITranslationUrl;->getShareUrl()Ljava/lang/String;

    move-result-object v1

    const-string v2, "android.intent.extra.TEXT"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "share url"

    invoke-static {v0, v1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method public final getMAITranslationUrl()Lcom/sma/smartv3/model/AITranslationUrl;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/WebTranslationActivity;->mAITranslationUrl:Lcom/sma/smartv3/model/AITranslationUrl;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mAITranslationUrl"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg3()Ljava/io/Serializable;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.sma.smartv3.model.AITranslationUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/model/AITranslationUrl;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/WebTranslationActivity;->setMAITranslationUrl(Lcom/sma/smartv3/model/AITranslationUrl;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/WebTranslationActivity;->getMAITranslationUrl()Lcom/sma/smartv3/model/AITranslationUrl;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "WebTranslationActivity "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method public initView()V
    .locals 8

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/WebTranslationActivity;->getMTitleLayout()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-super {p0}, Lcom/sma/smartv3/ui/me/WebViewActivity;->initView()V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/WebTranslationActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/WebTranslationActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f0807fe

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/WebTranslationActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f06074b

    invoke-static {p0, v1}, Lcom/android/mltcode/paycertificationapi/gk4;->O00(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v2

    new-instance v5, Lcom/sma/smartv3/otherdevice/charge/WebTranslationActivity$initView$1;

    const/4 v0, 0x0

    invoke-direct {v5, p0, v0}, Lcom/sma/smartv3/otherdevice/charge/WebTranslationActivity$initView$1;-><init>(Lcom/sma/smartv3/otherdevice/charge/WebTranslationActivity;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0134

    return v0
.end method

.method public final onTitleRightClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/WebTranslationActivity;->share()V

    return-void
.end method

.method public final setMAITranslationUrl(Lcom/sma/smartv3/model/AITranslationUrl;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/model/AITranslationUrl;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/WebTranslationActivity;->mAITranslationUrl:Lcom/sma/smartv3/model/AITranslationUrl;

    return-void
.end method

.method public final sharePage()V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/charge/WebTranslationActivity;->share()V

    return-void
.end method
