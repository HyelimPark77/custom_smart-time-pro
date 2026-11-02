.class public final Lcom/sma/smartv3/ui/me/LanguageListActivity;
.super Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLanguageListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageListActivity.kt\ncom/sma/smartv3/ui/me/LanguageListActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n11#2,2:125\n87#3,7:127\n94#3,3:135\n70#3,7:138\n97#3:145\n87#3,7:146\n94#3,3:154\n70#3,7:157\n97#3:164\n1#4:134\n1#4:153\n*S KotlinDebug\n*F\n+ 1 LanguageListActivity.kt\ncom/sma/smartv3/ui/me/LanguageListActivity\n*L\n85#1:125,2\n91#1:127,7\n91#1:135,3\n91#1:138,7\n91#1:145\n95#1:146,7\n95#1:154,3\n95#1:157,7\n95#1:164\n91#1:134\n95#1:153\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLanguageListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageListActivity.kt\ncom/sma/smartv3/ui/me/LanguageListActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n11#2,2:125\n87#3,7:127\n94#3,3:135\n70#3,7:138\n97#3:145\n87#3,7:146\n94#3,3:154\n70#3,7:157\n97#3:164\n1#4:134\n1#4:153\n*S KotlinDebug\n*F\n+ 1 LanguageListActivity.kt\ncom/sma/smartv3/ui/me/LanguageListActivity\n*L\n85#1:125,2\n91#1:127,7\n91#1:135,3\n91#1:138,7\n91#1:145\n95#1:146,7\n95#1:154,3\n95#1:157,7\n95#1:164\n91#1:134\n95#1:153\n*E\n"
    }
.end annotation


# instance fields
.field private final defaultLanguage:Ljava/lang/String;

.field private mRepairPopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final rootView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/fj;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/fj;-><init>(Lcom/sma/smartv3/ui/me/LanguageListActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/LanguageListActivity;->rootView$delegate:Lkotlin/Lazy;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/LanguageListActivity;->defaultLanguage:Ljava/lang/String;

    return-void
.end method

.method public static synthetic I0iXXO([Lcom/sma/smartv3/model/ExtraPackageData;Lcom/sma/smartv3/ui/me/LanguageListActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/me/LanguageListActivity;->showData$lambda$0$0$0([Lcom/sma/smartv3/model/ExtraPackageData;Lcom/sma/smartv3/ui/me/LanguageListActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/me/LanguageListActivity;Landroid/view/View;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/LanguageListActivity;->showData$lambda$0$0$0$0$1$0$0(Lcom/sma/smartv3/ui/me/LanguageListActivity;Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/me/LanguageListActivity;Lcom/sma/smartv3/model/ExtraPackageData;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/me/LanguageListActivity;->showData$lambda$0$0$0$0(Lcom/sma/smartv3/ui/me/LanguageListActivity;Lcom/sma/smartv3/model/ExtraPackageData;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/me/LanguageListActivity;[Lcom/sma/smartv3/model/ExtraPackageData;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/LanguageListActivity;->showData$lambda$0$0(Lcom/sma/smartv3/ui/me/LanguageListActivity;[Lcom/sma/smartv3/model/ExtraPackageData;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/me/LanguageListActivity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/LanguageListActivity;->rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/me/LanguageListActivity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/model/ExtraPackageData;Lcom/sma/smartv3/ui/me/LanguageListActivity;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/me/LanguageListActivity;->showData$lambda$0$0$0$0$1(Lcom/sma/smartv3/model/ExtraPackageData;Lcom/sma/smartv3/ui/me/LanguageListActivity;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/me/LanguageListActivity;Lcom/sma/smartv3/model/ExtraPackageData;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/me/LanguageListActivity;->showData$lambda$0$0$0$0$0(Lcom/sma/smartv3/ui/me/LanguageListActivity;Lcom/sma/smartv3/model/ExtraPackageData;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/me/LanguageListActivity;[Lcom/sma/smartv3/model/ExtraPackageData;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/me/LanguageListActivity;->showData$lambda$0(Lcom/sma/smartv3/ui/me/LanguageListActivity;[Lcom/sma/smartv3/model/ExtraPackageData;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$showData(Lcom/sma/smartv3/ui/me/LanguageListActivity;[Lcom/sma/smartv3/model/ExtraPackageData;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/me/LanguageListActivity;->showData([Lcom/sma/smartv3/model/ExtraPackageData;)V

    return-void
.end method

.method private final getRootView()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/LanguageListActivity;->rootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private static final rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/me/LanguageListActivity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a09b5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private final showData([Lcom/sma/smartv3/model/ExtraPackageData;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ij;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/ij;-><init>(Lcom/sma/smartv3/ui/me/LanguageListActivity;[Lcom/sma/smartv3/model/ExtraPackageData;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final showData$lambda$0(Lcom/sma/smartv3/ui/me/LanguageListActivity;[Lcom/sma/smartv3/model/ExtraPackageData;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$renderAdapter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslViewHolder()Lcom/angcyo/dsladapter/DslViewHolder;

    move-result-object p2

    new-instance v0, Lcom/android/mltcode/paycertificationapi/lj;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/lj;-><init>(Lcom/sma/smartv3/ui/me/LanguageListActivity;[Lcom/sma/smartv3/model/ExtraPackageData;)V

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->post(Lkotlin/jvm/functions/Function0;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$0$0(Lcom/sma/smartv3/ui/me/LanguageListActivity;[Lcom/sma/smartv3/model/ExtraPackageData;)Lkotlin/Unit;
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/gj;

    invoke-direct {v0, p1, p0}, Lcom/android/mltcode/paycertificationapi/gj;-><init>([Lcom/sma/smartv3/model/ExtraPackageData;Lcom/sma/smartv3/ui/me/LanguageListActivity;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$0$0$0([Lcom/sma/smartv3/model/ExtraPackageData;Lcom/sma/smartv3/ui/me/LanguageListActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 5

    const-string v0, "$this$renderAdapter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p0, v1

    invoke-virtual {v2}, Lcom/sma/smartv3/model/ExtraPackageData;->getType()I

    move-result v3

    const/4 v4, 0x3

    if-eq v3, v4, :cond_0

    new-instance v3, Lcom/android/mltcode/paycertificationapi/mj;

    invoke-direct {v3, p1, v2}, Lcom/android/mltcode/paycertificationapi/mj;-><init>(Lcom/sma/smartv3/ui/me/LanguageListActivity;Lcom/sma/smartv3/model/ExtraPackageData;)V

    const v2, 0x7f0d0eeb

    invoke-static {p2, v2, v3}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$0$0$0$0(Lcom/sma/smartv3/ui/me/LanguageListActivity;Lcom/sma/smartv3/model/ExtraPackageData;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/jj;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/jj;-><init>(Lcom/sma/smartv3/ui/me/LanguageListActivity;Lcom/sma/smartv3/model/ExtraPackageData;)V

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/kj;

    invoke-direct {v0, p1, p0}, Lcom/android/mltcode/paycertificationapi/kj;-><init>(Lcom/sma/smartv3/model/ExtraPackageData;Lcom/sma/smartv3/ui/me/LanguageListActivity;)V

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$0$0$0$0$0(Lcom/sma/smartv3/ui/me/LanguageListActivity;Lcom/sma/smartv3/model/ExtraPackageData;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 1

    const-string p3, "itemHolder"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "<unused var>"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p5, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p3

    sget-object p4, Lcom/szabh/smable3/entity/Languages;->INSTANCE:Lcom/szabh/smable3/entity/Languages;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/ExtraPackageData;->getType()I

    move-result p1

    const/4 p5, 0x0

    const/4 v0, 0x2

    invoke-static {p4, p1, p5, v0, p5}, Lcom/szabh/smable3/entity/Languages;->codeToLanguage$default(Lcom/szabh/smable3/entity/Languages;ILjava/lang/String;ILjava/lang/Object;)Ljava/util/Locale;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/content/res/Configuration;->setLocale(Ljava/util/Locale;)V

    const p1, 0x7f0a0680

    invoke-virtual {p2, p1}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p2

    iget-object p2, p2, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {p2}, Ljava/util/Locale;->getDisplayName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    new-instance p2, Ljava/util/Locale;

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/LanguageListActivity;->defaultLanguage:Ljava/lang/String;

    invoke-direct {p2, p0}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Landroid/content/res/Configuration;->setLocale(Ljava/util/Locale;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$0$0$0$0$1(Lcom/sma/smartv3/model/ExtraPackageData;Lcom/sma/smartv3/ui/me/LanguageListActivity;Landroid/view/View;)Lkotlin/Unit;
    .locals 4

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XO0O10()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-class v1, Lcom/sma/smartv3/model/ExtraPackageData;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v2, p0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p0, Lcom/android/mltcode/paycertificationapi/go0;

    invoke-virtual {p1}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v0, 0x7f140dca

    invoke-virtual {p0, v0}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v0, 0x7f14027f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p0, v0, v3, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/hj;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/hj;-><init>(Lcom/sma/smartv3/ui/me/LanguageListActivity;Landroid/view/View;)V

    const p2, 0x7f14034b

    invoke-virtual {p0, p2, v0}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object p0, p1, Lcom/sma/smartv3/ui/me/LanguageListActivity;->mRepairPopup:Lcom/android/mltcode/paycertificationapi/go0;

    invoke-direct {p1}, Lcom/sma/smartv3/ui/me/LanguageListActivity;->getRootView()Landroid/widget/LinearLayout;

    move-result-object p1

    const-string p2, "<get-rootView>(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$0$0$0$0$1$0$0(Lcom/sma/smartv3/ui/me/LanguageListActivity;Landroid/view/View;)Z
    .locals 8

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->Xi1i0XOX0()I

    move-result v0

    const-string v1, "mArg3"

    const-string v2, "mArg2"

    const-string v3, "mArg1"

    const-string v4, "mArg0"

    const v5, 0x7f0a0680

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v0, :cond_1

    if-eq v0, v6, :cond_0

    const p0, 0x7f1412c0

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/view/text/PFMedium;

    invoke-virtual {p1}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v0

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v5, v4, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5, v3, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {v5, v2, v7}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v5, v1, v7}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/device/LanguageRepairSmaActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v5}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/view/text/PFMedium;

    invoke-virtual {p1}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v0

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v5, v4, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5, v3, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {v5, v2, v7}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v5, v1, v7}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/device/LanguageRepairRActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v5}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    :goto_0
    return v6
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
    .locals 4

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->initView()V

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    sget-object v0, Lcom/sma/smartv3/biz/DeviceInfoChecker;->OXO1:Lcom/sma/smartv3/biz/DeviceInfoChecker;

    new-instance v1, Lcom/sma/smartv3/ui/me/LanguageListActivity$OXO1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/me/LanguageListActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/me/LanguageListActivity;)V

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lcom/sma/smartv3/biz/DeviceInfoChecker;->XiOIii1(Lcom/sma/smartv3/biz/DeviceInfoChecker;Lcom/android/mltcode/paycertificationapi/O0Oiii;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00ba

    return v0
.end method

.method public onInitBaseLayoutAfter()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->onInitBaseLayoutAfter()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    const/4 v2, 0x1

    invoke-direct {v1, v2, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;-><init>(II)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

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

.method public recyclerViewId()I
    .locals 1

    const v0, 0x7f0a09c1

    return v0
.end method

.method public refreshLayoutId()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
