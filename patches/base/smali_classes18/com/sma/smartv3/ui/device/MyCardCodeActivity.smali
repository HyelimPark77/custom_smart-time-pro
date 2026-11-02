.class public final Lcom/sma/smartv3/ui/device/MyCardCodeActivity;
.super Lcom/bestmafen/androidbase/list/BaseListActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/list/BaseListActivity<",
        "Lcom/sma/smartv3/model/QrcodeTypeInfo;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMyCardCodeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyCardCodeActivity.kt\ncom/sma/smartv3/ui/device/MyCardCodeActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,236:1\n50#2,3:237\n53#2:243\n55#2,2:245\n35#2,2:247\n1563#3:240\n1634#3,2:241\n1636#3:244\n173#4,7:249\n180#4,3:257\n143#4,7:260\n183#4:267\n1#5:256\n*S KotlinDebug\n*F\n+ 1 MyCardCodeActivity.kt\ncom/sma/smartv3/ui/device/MyCardCodeActivity\n*L\n94#1:237,3\n94#1:243\n94#1:245,2\n100#1:247,2\n94#1:240\n94#1:241,2\n94#1:244\n186#1:249,7\n186#1:257,3\n186#1:260,7\n186#1:267\n186#1:256\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMyCardCodeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyCardCodeActivity.kt\ncom/sma/smartv3/ui/device/MyCardCodeActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,236:1\n50#2,3:237\n53#2:243\n55#2,2:245\n35#2,2:247\n1563#3:240\n1634#3,2:241\n1636#3:244\n173#4,7:249\n180#4,3:257\n143#4,7:260\n183#4:267\n1#5:256\n*S KotlinDebug\n*F\n+ 1 MyCardCodeActivity.kt\ncom/sma/smartv3/ui/device/MyCardCodeActivity\n*L\n94#1:237,3\n94#1:243\n94#1:245,2\n100#1:247,2\n94#1:240\n94#1:241,2\n94#1:244\n186#1:249,7\n186#1:257,3\n186#1:260,7\n186#1:267\n186#1:256\n*E\n"
    }
.end annotation


# instance fields
.field private final bleHandleCallback:Lcom/sma/smartv3/ui/device/MyCardCodeActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final btnBottom$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mEditPop:Lcom/android/mltcode/paycertificationapi/iii1ii;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final rootView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tmps:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/QrcodeTypeInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/oz0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/oz0;-><init>(Lcom/sma/smartv3/ui/device/MyCardCodeActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->rootView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/pz0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/pz0;-><init>(Lcom/sma/smartv3/ui/device/MyCardCodeActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->btnBottom$delegate:Lkotlin/Lazy;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->tmps:Ljava/util/ArrayList;

    new-instance v0, Lcom/sma/smartv3/ui/device/MyCardCodeActivity$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/MyCardCodeActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/device/MyCardCodeActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->bleHandleCallback:Lcom/sma/smartv3/ui/device/MyCardCodeActivity$OXO1;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/MyCardCodeActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->initView$lambda$1$0(Lcom/sma/smartv3/ui/device/MyCardCodeActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/device/MyCardCodeActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MyCardCodeActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/device/MyCardCodeActivity;Lcom/android/mltcode/paycertificationapi/fi5;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->initView$lambda$0$0(Lcom/sma/smartv3/ui/device/MyCardCodeActivity;Lcom/android/mltcode/paycertificationapi/fi5;)V

    return-void
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/MyCardCodeActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->initView$lambda$1(Lcom/sma/smartv3/ui/device/MyCardCodeActivity;)V

    return-void
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/MyCardCodeActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->initView$lambda$0$1$0(Lcom/sma/smartv3/ui/device/MyCardCodeActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/MyCardCodeActivity;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->addQrcode$lambda$0$0(Lcom/sma/smartv3/ui/device/MyCardCodeActivity;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/MyCardCodeActivity;ILcom/android/mltcode/paycertificationapi/fi5;I)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->initView$lambda$0$1(Lcom/sma/smartv3/ui/device/MyCardCodeActivity;ILcom/android/mltcode/paycertificationapi/fi5;I)Z

    move-result p0

    return p0
.end method

.method public static synthetic XXI(Landroid/content/Intent;Lcom/sma/smartv3/ui/device/MyCardCodeActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->onActivityResult$lambda$0(Landroid/content/Intent;Lcom/sma/smartv3/ui/device/MyCardCodeActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/device/MyCardCodeActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->btnBottom_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MyCardCodeActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$checkCount(Lcom/sma/smartv3/ui/device/MyCardCodeActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->checkCount()V

    return-void
.end method

.method public static final synthetic access$getMList(Lcom/sma/smartv3/ui/device/MyCardCodeActivity;)Ljava/util/List;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMListAdapter(Lcom/sma/smartv3/ui/device/MyCardCodeActivity;)Lcom/android/mltcode/paycertificationapi/XII0Oi10O;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListAdapter()Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMLoadingPopup$p(Lcom/sma/smartv3/ui/device/MyCardCodeActivity;)Lcom/android/mltcode/paycertificationapi/uq;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    return-object p0
.end method

.method public static final synthetic access$getTmps$p(Lcom/sma/smartv3/ui/device/MyCardCodeActivity;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->tmps:Ljava/util/ArrayList;

    return-object p0
.end method

.method private final addQrcode()V
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->mEditPop:Lcom/android/mltcode/paycertificationapi/iii1ii;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iii1ii;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4, v2, v3}, Lcom/android/mltcode/paycertificationapi/iii1ii;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/iii1ii;->X01IiOiIi()Landroid/widget/EditText;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/O0iXOO;

    const/16 v3, 0x1e

    invoke-direct {v2, v3}, Lcom/android/mltcode/paycertificationapi/O0iXOO;-><init>(I)V

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/iii1ii;->X01IiOiIi()Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f06024d

    invoke-static {v2, v3}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    const v1, 0x7f14134a

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/iii1ii;->XXX11i(I)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/hz0;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/hz0;-><init>(Lcom/sma/smartv3/ui/device/MyCardCodeActivity;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/iii1ii;->X11iII1O1(Lkotlin/jvm/functions/Function1;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->mEditPop:Lcom/android/mltcode/paycertificationapi/iii1ii;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->mEditPop:Lcom/android/mltcode/paycertificationapi/iii1ii;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_1
    return-void
.end method

.method private static final addQrcode$lambda$0$0(Lcom/sma/smartv3/ui/device/MyCardCodeActivity;Ljava/lang/String;)Z
    .locals 12

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/sma/smartv3/ui/device/AddQrcodeActivity;->Companion:Lcom/sma/smartv3/ui/device/AddQrcodeActivity$OXO1;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/AddQrcodeActivity$OXO1;->OXO1()I

    move-result v0

    new-instance v1, Lcom/sma/smartv3/model/QrcodeTypeInfo;

    const/16 v10, 0x77

    const/4 v11, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v5, p1

    invoke-direct/range {v1 .. v11}, Lcom/sma/smartv3/model/QrcodeTypeInfo;-><init>(IIILjava/lang/String;JI[BILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "mArg0"

    const/4 v3, 0x0

    invoke-virtual {p1, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "mArg2"

    invoke-virtual {p1, v2, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v2, "mArg3"

    invoke-virtual {p1, v2, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/sma/smartv3/ui/device/AddQrcodeActivity;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_0
    const/4 p0, 0x1

    return p0
.end method

.method private static final btnBottom_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MyCardCodeActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a01b9

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final checkCount()V
    .locals 3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->getBtnBottom()Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sget-object v2, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->IX1XiI()I

    move-result v2

    if-ge v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method

.method private final getBtnBottom()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->btnBottom$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getRootView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->rootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private static final initView$lambda$0$0(Lcom/sma/smartv3/ui/device/MyCardCodeActivity;Lcom/android/mltcode/paycertificationapi/fi5;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ji5;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ji5;-><init>(Landroid/content/Context;)V

    const/high16 p0, 0x42900000    # 72.0f

    invoke-static {p0}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result p0

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/ji5;->I1XOi1(I)V

    const p0, 0x7f080ffe

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/ji5;->IO(I)V

    const p0, 0x7f080fad

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/ji5;->I0IIOi(I)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/fi5;->OXO1(Lcom/android/mltcode/paycertificationapi/ji5;)V

    return-void
.end method

.method private static final initView$lambda$0$1(Lcom/sma/smartv3/ui/device/MyCardCodeActivity;ILcom/android/mltcode/paycertificationapi/fi5;I)Z
    .locals 0

    new-instance p2, Lcom/android/mltcode/paycertificationapi/iz0;

    invoke-direct {p2, p0, p1}, Lcom/android/mltcode/paycertificationapi/iz0;-><init>(Lcom/sma/smartv3/ui/device/MyCardCodeActivity;I)V

    const/4 p0, 0x0

    const/4 p1, 0x0

    const/4 p3, 0x1

    invoke-static {p1, p2, p3, p0}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result p0

    xor-int/2addr p0, p3

    return p0
.end method

.method private static final initView$lambda$0$1$0(Lcom/sma/smartv3/ui/device/MyCardCodeActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->tmps:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->clear()V

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->tmps:Ljava/util/ArrayList;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->tmps:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->tmps:Ljava/util/ArrayList;

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->syncQrcode(Ljava/util/List;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/ui/device/MyCardCodeActivity;)V
    .locals 3

    new-instance v0, Lcom/android/mltcode/paycertificationapi/jz0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/jz0;-><init>(Lcom/sma/smartv3/ui/device/MyCardCodeActivity;)V

    const/4 p0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v2, v0, p0, v1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    return-void
.end method

.method private static final initView$lambda$1$0(Lcom/sma/smartv3/ui/device/MyCardCodeActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->tmps:Ljava/util/ArrayList;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->tmps:Ljava/util/ArrayList;

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->syncQrcode(Ljava/util/List;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onActivityResult$lambda$0(Landroid/content/Intent;Lcom/sma/smartv3/ui/device/MyCardCodeActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    const-string p2, "qrcode"

    invoke-virtual {p0, p2}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    const-string p2, "null cannot be cast to non-null type com.sma.smartv3.model.QrcodeTypeInfo"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;

    iget-object p2, p1, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->tmps:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->clear()V

    iget-object p2, p1, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->tmps:Ljava/util/ArrayList;

    invoke-virtual {p1}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object p2, p1, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->tmps:Ljava/util/ArrayList;

    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p0, p1, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->tmps:Ljava/util/ArrayList;

    invoke-direct {p1, p0}, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->syncQrcode(Ljava/util/List;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/MyCardCodeActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a09b5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final syncQrcode(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/QrcodeTypeInfo;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/uq;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/uq;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_1
    :try_start_0
    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->QRCODE2:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/android/mltcode/paycertificationapi/ta2;->OXO1:Lcom/android/mltcode/paycertificationapi/ta2;

    invoke-virtual {v2, p1}, Lcom/android/mltcode/paycertificationapi/ta2;->I0IIOi(Ljava/util/List;)[B

    move-result-object p1

    const/4 v2, 0x2

    invoke-virtual {v0, v1, p1, v2}, Lcom/szabh/smable3/component/BleConnector;->sendStream(Lcom/szabh/smable3/BleKey;[BI)Z

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->QRCODE2:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->DELETE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt8$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;IZZILjava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_3
    return-void
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->bleHandleCallback:Lcom/sma/smartv3/ui/device/MyCardCodeActivity$OXO1;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public initItem(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/sma/smartv3/model/QrcodeTypeInfo;I)V
    .locals 3
    .param p1    # Lcom/android/mltcode/paycertificationapi/ug6;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/model/QrcodeTypeInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string p3, "holder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "item"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0a0cc7

    .line 2
    invoke-virtual {p1, p3}, Lcom/android/mltcode/paycertificationapi/ug6;->O00(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/sma/smartv3/model/QrcodeTypeInfo;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p3, 0x7f0a0cd7

    .line 3
    invoke-virtual {p1, p3}, Lcom/android/mltcode/paycertificationapi/ug6;->O00(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v2, v2, v0, v1}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->i0X000X0O(ZZILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/model/QrcodeTypeInfo;->getDateTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    new-instance p3, Ljava/io/File;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->Ii1iii0(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/model/QrcodeTypeInfo;->getDateTime()J

    move-result-wide v1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ".jpg"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p3, v0, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 5
    invoke-static {p3}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/io/File;)Z

    move-result p2

    if-eqz p2, :cond_0

    const p2, 0x7f0a0663

    .line 6
    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/ug6;->O00(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    .line 7
    invoke-static {p3}, Lcom/blankj/utilcode/util/ImageUtils;->getBitmap(Ljava/io/File;)Landroid/graphics/Bitmap;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic initItem(Lcom/android/mltcode/paycertificationapi/ug6;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/sma/smartv3/model/QrcodeTypeInfo;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->initItem(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/sma/smartv3/model/QrcodeTypeInfo;I)V

    return-void
.end method

.method public initList()Ljava/util/List;
    .locals 6
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/QrcodeTypeInfo;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "MY_CARD_CODE_LIST"

    :try_start_0
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/gson/JsonParser;->parseString(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/gson/JsonElement;->getAsJsonArray()Lcom/google/gson/JsonArray;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/gson/JsonElement;

    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    const-class v5, Lcom/sma/smartv3/model/QrcodeTypeInfo;

    invoke-virtual {v4, v3, v5}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v2

    :cond_0
    check-cast v2, Ljava/util/Collection;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    sget-object v3, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/q62;->IX1XiI()I

    move-result v4

    if-gt v2, v4, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/q62;->IX1XiI()I

    move-result v3

    invoke-interface {v0, v2, v3}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    sget-object v2, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v3, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-object v0
.end method

.method public initView()V
    .locals 4

    invoke-super {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->initView()V

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f140fcc

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListView()Landroid/widget/ListView;

    move-result-object v0

    const v1, 0x7f0a035b

    invoke-virtual {p0, v1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setEmptyView(Landroid/view/View;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListView()Landroid/widget/ListView;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.baoyz.swipemenulistview.SwipeMenuListView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/baoyz/swipemenulistview/SwipeMenuListView;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/kz0;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/kz0;-><init>(Lcom/sma/smartv3/ui/device/MyCardCodeActivity;)V

    invoke-virtual {v0, v1}, Lcom/baoyz/swipemenulistview/SwipeMenuListView;->setMenuCreator(Lcom/android/mltcode/paycertificationapi/hi5;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/lz0;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/lz0;-><init>(Lcom/sma/smartv3/ui/device/MyCardCodeActivity;)V

    invoke-virtual {v0, v1}, Lcom/baoyz/swipemenulistview/SwipeMenuListView;->setOnMenuItemClickListener(Lcom/baoyz/swipemenulistview/SwipeMenuListView$XIi00iiXO;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->getRootView()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/mz0;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/mz0;-><init>(Lcom/sma/smartv3/ui/device/MyCardCodeActivity;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public itemLayoutId()I
    .locals 1

    const v0, 0x7f0d0ef8

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00d0

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1
    .param p3    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    sget-object p2, Lcom/sma/smartv3/ui/device/AddQrcodeActivity;->Companion:Lcom/sma/smartv3/ui/device/AddQrcodeActivity$OXO1;

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/device/AddQrcodeActivity$OXO1;->OXO1()I

    move-result p2

    if-ne p1, p2, :cond_0

    new-instance p1, Lcom/android/mltcode/paycertificationapi/nz0;

    invoke-direct {p1, p3, p0}, Lcom/android/mltcode/paycertificationapi/nz0;-><init>(Landroid/content/Intent;Lcom/sma/smartv3/ui/device/MyCardCodeActivity;)V

    const/4 p2, 0x1

    const/4 p3, 0x0

    const/4 v0, 0x0

    invoke-static {v0, p1, p2, p3}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final onBottomClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->addQrcode()V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->bleHandleCallback:Lcom/sma/smartv3/ui/device/MyCardCodeActivity$OXO1;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    return-void
.end method

.method public onResume()V
    .locals 0

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/MyCardCodeActivity;->checkCount()V

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
