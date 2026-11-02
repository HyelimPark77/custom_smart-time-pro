.class public final Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;
.super Lcom/bestmafen/androidbase/list/BaseListActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/list/BaseListActivity<",
        "Lcom/sma/smartv3/model/ExtraPackageData;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeveloperOtaSelectExtraPackageDialActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperOtaSelectExtraPackageDialActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,89:1\n19#2:90\n15#2:91\n19#2:92\n15#2:93\n11#2,2:112\n69#3,3:94\n72#3,5:98\n69#3,3:103\n72#3,5:107\n1#4:97\n1#4:106\n*S KotlinDebug\n*F\n+ 1 DeveloperOtaSelectExtraPackageDialActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity\n*L\n26#1:90\n26#1:91\n32#1:92\n32#1:93\n74#1:112,2\n42#1:94,3\n42#1:98,5\n85#1:103,3\n85#1:107,5\n42#1:97\n85#1:106\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeveloperOtaSelectExtraPackageDialActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperOtaSelectExtraPackageDialActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,89:1\n19#2:90\n15#2:91\n19#2:92\n15#2:93\n11#2,2:112\n69#3,3:94\n72#3,5:98\n69#3,3:103\n72#3,5:107\n1#4:97\n1#4:106\n*S KotlinDebug\n*F\n+ 1 DeveloperOtaSelectExtraPackageDialActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity\n*L\n26#1:90\n26#1:91\n32#1:92\n32#1:93\n74#1:112,2\n42#1:94,3\n42#1:98,5\n85#1:103,3\n85#1:107,5\n42#1:97\n85#1:106\n*E\n"
    }
.end annotation


# instance fields
.field private final btNext$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final dataList:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/ExtraPackageData;",
            ">;"
        }
    .end annotation
.end field

.field private final extraPackVersions:Lcom/sma/smartv3/model/ExtraPackVersions;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvSelect$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvSelectRemind$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 11

    invoke-direct {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IIiIiII1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IIiIiII1;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;->tvSelectRemind$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I0i100IX1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I0i100IX1;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;->tvSelect$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iO1O10O;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iO1O10O;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;->btNext$delegate:Lkotlin/Lazy;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;->dataList:Ljava/util/ArrayList;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/model/ExtraPackVersions;

    const/16 v9, 0x7f

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lcom/sma/smartv3/model/ExtraPackVersions;-><init>(Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    const-class v3, Lcom/sma/smartv3/model/ExtraPackVersions;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    check-cast v1, Lcom/sma/smartv3/model/ExtraPackVersions;

    iput-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;->extraPackVersions:Lcom/sma/smartv3/model/ExtraPackVersions;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;->tvSelect_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;Lcom/sma/smartv3/model/ExtraPackageData;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;->initItem$lambda$0$0(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;Lcom/sma/smartv3/model/ExtraPackageData;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;->tvSelectRemind_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;->btNext_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;)Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p0

    return-object p0
.end method

.method private static final btNext_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 1

    const v0, 0x7f0a01a0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/appcompat/widget/AppCompatButton;

    return-object p0
.end method

.method private final getBtNext()Landroidx/appcompat/widget/AppCompatButton;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;->btNext$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/AppCompatButton;

    return-object v0
.end method

.method private final getTvSelect()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;->tvSelect$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvSelectRemind()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;->tvSelectRemind$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private static final initItem$lambda$0$0(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;Lcom/sma/smartv3/model/ExtraPackageData;Landroid/view/View;)V
    .locals 13

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;->getTvSelect()Landroid/widget/TextView;

    move-result-object p2

    invoke-virtual {p1}, Lcom/sma/smartv3/model/ExtraPackageData;->getVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/ExtraPackageData;->getInfo()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "  -- "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;->extraPackVersions:Lcom/sma/smartv3/model/ExtraPackVersions;

    new-instance v0, Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/ExtraPackageData;->getFileName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/sma/smartv3/model/ExtraPackageData;->getFileSize()I

    move-result v2

    invoke-virtual {p1}, Lcom/sma/smartv3/model/ExtraPackageData;->getFileUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/sma/smartv3/model/ExtraPackageData;->getVersion()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/sma/smartv3/model/ExtraPackageData;->getInfo()Ljava/lang/String;

    move-result-object v5

    const/16 v11, 0x3e0

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v0 .. v12}, Lcom/sma/smartv3/model/FirmwareVersion;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p2, v0}, Lcom/sma/smartv3/model/ExtraPackVersions;->setDialPackVersion(Lcom/sma/smartv3/model/FirmwareVersion;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;->extraPackVersions:Lcom/sma/smartv3/model/ExtraPackVersions;

    const-class p2, Lcom/sma/smartv3/model/ExtraPackVersions;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, p0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p2, p0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static final tvSelectRemind_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0d0a

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvSelect_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0d09

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    new-instance v0, Lcom/sma/smartv3/model/ExtraPackageDataList;

    const/4 v1, 0x0

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2, v1}, Lcom/sma/smartv3/model/ExtraPackageDataList;-><init>(ILjava/util/ArrayList;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    const-class v2, Lcom/sma/smartv3/model/ExtraPackageDataList;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    check-cast v0, Lcom/sma/smartv3/model/ExtraPackageDataList;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/ExtraPackageDataList;->getData()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const-string v0, "iterator(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "next(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/sma/smartv3/model/ExtraPackageData;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/ExtraPackageData;->getType()I

    move-result v1

    const/4 v2, -0x7

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;->dataList:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;->dataList:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-nez p1, :cond_3

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    :cond_3
    return-void
.end method

.method public initItem(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/sma/smartv3/model/ExtraPackageData;I)V
    .locals 5
    .param p1    # Lcom/android/mltcode/paycertificationapi/ug6;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/model/ExtraPackageData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string p3, "holder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "item"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p2}, Lcom/sma/smartv3/model/ExtraPackageData;->getVersion()Ljava/lang/String;

    move-result-object p3

    .line 3
    invoke-virtual {p2}, Lcom/sma/smartv3/model/ExtraPackageData;->getFileName()Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-virtual {p2}, Lcom/sma/smartv3/model/ExtraPackageData;->getFirmwareVersion()Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-virtual {p2}, Lcom/sma/smartv3/model/ExtraPackageData;->getInfo()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "version:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "\nfileName:"

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "\nfirmwareVersion:"

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "\ninfo:"

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const v0, 0x1020014

    .line 6
    invoke-virtual {p1, v0, p3}, Lcom/android/mltcode/paycertificationapi/ug6;->OII(ILjava/lang/String;)Lcom/android/mltcode/paycertificationapi/ug6;

    .line 7
    new-instance p3, Lcom/android/mltcode/paycertificationapi/I0I0iI;

    invoke-direct {p3, p0, p2}, Lcom/android/mltcode/paycertificationapi/I0I0iI;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;Lcom/sma/smartv3/model/ExtraPackageData;)V

    invoke-virtual {p1, v0, p3}, Lcom/android/mltcode/paycertificationapi/ug6;->O10IXXX0X(ILandroid/view/View$OnClickListener;)Lcom/android/mltcode/paycertificationapi/ug6;

    return-void
.end method

.method public bridge synthetic initItem(Lcom/android/mltcode/paycertificationapi/ug6;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/sma/smartv3/model/ExtraPackageData;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;->initItem(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/sma/smartv3/model/ExtraPackageData;I)V

    return-void
.end method

.method public initList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/ExtraPackageData;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;->dataList:Ljava/util/ArrayList;

    return-object v0
.end method

.method public initView()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->initView()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;->getTvSelectRemind()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f141218

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public itemLayoutId()I
    .locals 1

    const v0, 0x1090003

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0075

    return v0
.end method

.method public final nextOnClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;->getBtNext()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public onResume()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectExtraPackageDialActivity;->getBtNext()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
