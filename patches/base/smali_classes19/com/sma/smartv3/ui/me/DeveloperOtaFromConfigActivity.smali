.class public final Lcom/sma/smartv3/ui/me/DeveloperOtaFromConfigActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeveloperOtaFromConfigActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperOtaFromConfigActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaFromConfigActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n69#2,3:48\n72#2,5:52\n1#3:51\n*S KotlinDebug\n*F\n+ 1 DeveloperOtaFromConfigActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaFromConfigActivity\n*L\n40#1:48,3\n40#1:52,5\n40#1:51\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeveloperOtaFromConfigActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperOtaFromConfigActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaFromConfigActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n69#2,3:48\n72#2,5:52\n1#3:51\n*S KotlinDebug\n*F\n+ 1 DeveloperOtaFromConfigActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaFromConfigActivity\n*L\n40#1:48,3\n40#1:52,5\n40#1:51\n*E\n"
    }
.end annotation


# instance fields
.field private final mEtContent$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iI1OO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iI1OO;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaFromConfigActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaFromConfigActivity;->mEtContent$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/me/DeveloperOtaFromConfigActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaFromConfigActivity;->mEtContent_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaFromConfigActivity;)Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method private final getMEtContent()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaFromConfigActivity;->mEtContent$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    return-object v0
.end method

.method private static final mEtContent_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaFromConfigActivity;)Landroid/widget/EditText;
    .locals 1

    const v0, 0x7f0a0371

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/EditText;

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
    .locals 0

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0061

    return v0
.end method

.method public final onStart(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaFromConfigActivity;->getMEtContent()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-static {p1}, Lcom/blankj/utilcode/util/EncodeUtils;->base64Decode(Ljava/lang/String;)[B

    move-result-object p1

    const-string v0, "base64Decode(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/String;

    sget-object v1, Lkotlin/text/Charsets;->XIi00iiXO:Ljava/nio/charset/Charset;

    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    new-instance p1, Lcom/google/gson/Gson;

    invoke-direct {p1}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/sma/smartv3/model/BatchOtaConfig;

    invoke-virtual {p1, v0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "Format error\uff01"

    invoke-static {v0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "otaConfig"

    check-cast p1, Ljava/io/Serializable;

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;

    invoke-direct {p1, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    :cond_1
    return-void
.end method
