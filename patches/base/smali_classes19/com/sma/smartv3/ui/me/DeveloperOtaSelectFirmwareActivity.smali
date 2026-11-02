.class public final Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity;
.super Lcom/bestmafen/androidbase/list/BaseListActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/list/BaseListActivity<",
        "Lcom/sma/smartv3/model/FirmwareVersion;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeveloperOtaSelectFirmwareActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperOtaSelectFirmwareActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 5 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n19#2:107\n15#2:108\n19#2:109\n15#2:110\n11#2,2:140\n176#3,11:111\n196#3:130\n252#4,7:122\n270#4:129\n69#5,3:131\n72#5,5:135\n1#6:134\n*S KotlinDebug\n*F\n+ 1 DeveloperOtaSelectFirmwareActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity\n*L\n39#1:107\n39#1:108\n41#1:109\n41#1:110\n64#1:140,2\n80#1:111,11\n80#1:130\n80#1:122,7\n80#1:129\n101#1:131,3\n101#1:135,5\n101#1:134\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeveloperOtaSelectFirmwareActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperOtaSelectFirmwareActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 5 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n19#2:107\n15#2:108\n19#2:109\n15#2:110\n11#2,2:140\n176#3,11:111\n196#3:130\n252#4,7:122\n270#4:129\n69#5,3:131\n72#5,5:135\n1#6:134\n*S KotlinDebug\n*F\n+ 1 DeveloperOtaSelectFirmwareActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity\n*L\n39#1:107\n39#1:108\n41#1:109\n41#1:110\n64#1:140,2\n80#1:111,11\n80#1:130\n80#1:122,7\n80#1:129\n101#1:131,3\n101#1:135,5\n101#1:134\n*E\n"
    }
.end annotation


# instance fields
.field private final btNext$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private dataList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/FirmwareVersion;",
            ">;"
        }
    .end annotation
.end field

.field private firmwareID:I

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
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iOI10X0X;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iOI10X0X;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity;->tvSelectRemind$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iXO0XO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iXO0XO;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity;->tvSelect$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i1ii11Xi0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i1ii11Xi0;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity;->btNext$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity;Lcom/sma/smartv3/model/FirmwareVersion;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity;->initItem$lambda$0$0(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity;Lcom/sma/smartv3/model/FirmwareVersion;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity;->btNext_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity;)Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity;->tvSelect_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity;->tvSelectRemind_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method private static final btNext_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 1

    const v0, 0x7f0a01a0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/appcompat/widget/AppCompatButton;

    return-object p0
.end method

.method private final getBtNext()Landroidx/appcompat/widget/AppCompatButton;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity;->btNext$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/AppCompatButton;

    return-object v0
.end method

.method private final getTvSelect()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity;->tvSelect$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvSelectRemind()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity;->tvSelectRemind$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private static final initItem$lambda$0$0(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity;Lcom/sma/smartv3/model/FirmwareVersion;Landroid/view/View;)V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity;->getTvSelect()Landroid/widget/TextView;

    move-result-object p0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/FirmwareVersion;->getVersion()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/sma/smartv3/model/FirmwareVersion;->getInfo()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "  -- "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object p0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p0

    const-class p2, Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p2, p1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static final tvSelectRemind_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0d0a

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvSelect_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0d09

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 8
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/model/FirmwareVersionList;

    const/4 v2, 0x0

    const/4 v3, 0x3

    const/4 v4, 0x0

    invoke-direct {v1, v4, v2, v3, v2}, Lcom/sma/smartv3/model/FirmwareVersionList;-><init>(ILjava/util/ArrayList;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    const-class v3, Lcom/sma/smartv3/model/FirmwareVersionList;

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
    check-cast v1, Lcom/sma/smartv3/model/FirmwareVersionList;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/FirmwareVersionList;->getData()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity;->dataList:Ljava/util/ArrayList;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    new-instance v0, Lcom/sma/smartv3/model/BleFirmwareInfo;

    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Lcom/sma/smartv3/model/BleFirmwareInfo;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    const-class v2, Lcom/sma/smartv3/model/BleFirmwareInfo;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    move-object v0, p1

    :goto_1
    check-cast v0, Lcom/sma/smartv3/model/BleFirmwareInfo;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/BleFirmwareInfo;->getId()I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity;->firmwareID:I

    return-void
.end method

.method public initItem(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/sma/smartv3/model/FirmwareVersion;I)V
    .locals 4
    .param p1    # Lcom/android/mltcode/paycertificationapi/ug6;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/model/FirmwareVersion;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string p3, "holder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "item"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p2}, Lcom/sma/smartv3/model/FirmwareVersion;->getVersion()Ljava/lang/String;

    move-result-object p3

    .line 3
    invoke-virtual {p2}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-virtual {p2}, Lcom/sma/smartv3/model/FirmwareVersion;->getInfo()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "firmwareVersion:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "\nfileName:"

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "\ninfo:"

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const v0, 0x1020014

    .line 5
    invoke-virtual {p1, v0, p3}, Lcom/android/mltcode/paycertificationapi/ug6;->OII(ILjava/lang/String;)Lcom/android/mltcode/paycertificationapi/ug6;

    .line 6
    new-instance p3, Lcom/android/mltcode/paycertificationapi/O1XiOiI;

    invoke-direct {p3, p0, p2}, Lcom/android/mltcode/paycertificationapi/O1XiOiI;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity;Lcom/sma/smartv3/model/FirmwareVersion;)V

    invoke-virtual {p1, v0, p3}, Lcom/android/mltcode/paycertificationapi/ug6;->O10IXXX0X(ILandroid/view/View$OnClickListener;)Lcom/android/mltcode/paycertificationapi/ug6;

    return-void
.end method

.method public bridge synthetic initItem(Lcom/android/mltcode/paycertificationapi/ug6;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity;->initItem(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/sma/smartv3/model/FirmwareVersion;I)V

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
            "Lcom/sma/smartv3/model/FirmwareVersion;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity;->dataList:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    const-string v0, "dataList"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method public initView()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->initView()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity;->getTvSelectRemind()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f141219

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
    .locals 9
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const/4 v0, 0x0

    const/4 v1, 0x1

    const-string v2, "view"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity;->getBtNext()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p1

    const/16 v2, 0x8

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v2, "TEST_MODE_SELECT_PLATFORM"

    invoke-virtual {p1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;)I

    move-result p1

    if-eqz p1, :cond_1

    if-eq p1, v1, :cond_0

    const/4 v2, 0x2

    if-eq p1, v2, :cond_0

    const/4 v2, 0x4

    if-eq p1, v2, :cond_0

    const/4 v2, 0x5

    if-eq p1, v2, :cond_1

    const/4 v0, 0x6

    if-eq p1, v0, :cond_0

    const/4 v0, 0x7

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_1
    new-array p1, v0, [Ljava/lang/Object;

    const-string v2, "Network request, please wait"

    invoke-static {v2, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    iget v2, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity;->firmwareID:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/sma/smartv3/network/RequestBodyKt;->getBleFirmwareVersionListBody(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity$nextOnClick$1;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity$nextOnClick$1;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity;)V

    const/4 v4, 0x0

    invoke-virtual {p1, v4, v4}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v5

    sget-object v6, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v6}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v6

    const-string v7, "/ble_extra_pack_version/list"

    invoke-virtual {p1, v6, v7}, Lcom/sma/smartv3/network/NetWorkUtils;->convertBaseUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1, v8, v2}, Lcom/sma/smartv3/network/NetWorkUtils;->printParam(Ljava/lang/String;Ljava/util/Map;)V

    sget-object p1, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v6, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity$nextOnClick$$inlined$post$default$1;

    invoke-direct {v6, v4, v3, v5}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity$nextOnClick$$inlined$post$default$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {p1}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    sget-object v2, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, v2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    new-array v1, v1, [Ljava/lang/reflect/Type;

    const-class v2, Lcom/sma/smartv3/model/ExtraPackageDataList;

    aput-object v2, v1, v0

    const-class v0, Lcom/sma/androidnetworklib/model/Response;

    invoke-static {v0, v1}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity$nextOnClick$$inlined$post$default$2;

    invoke-direct {v1, v6}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity$nextOnClick$$inlined$post$default$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {p1, v0, v1}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method public onResume()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity;->getBtNext()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
