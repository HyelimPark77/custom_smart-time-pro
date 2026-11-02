.class public Lcom/sma/smartv3/ui/ai/fragment/AIFragment;
.super Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAIFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIFragment.kt\ncom/sma/smartv3/ui/ai/fragment/AIFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n1869#2,2:171\n1878#2,3:173\n*S KotlinDebug\n*F\n+ 1 AIFragment.kt\ncom/sma/smartv3/ui/ai/fragment/AIFragment\n*L\n152#1:171,2\n79#1:173,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAIFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIFragment.kt\ncom/sma/smartv3/ui/ai/fragment/AIFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n1869#2,2:171\n1878#2,3:173\n*S KotlinDebug\n*F\n+ 1 AIFragment.kt\ncom/sma/smartv3/ui/ai/fragment/AIFragment\n*L\n152#1:171,2\n79#1:173,3\n*E\n"
    }
.end annotation


# instance fields
.field private final ITEM_GROUPS_TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private bannerItem:Lcom/bestmafen/androidbase/dsl/BaseDslItem;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mCurCat:Lcom/sma/smartv3/model/AIFunctionCat;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;-><init>()V

    const-string v0, "groups"

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/fragment/AIFragment;->ITEM_GROUPS_TAG:Ljava/lang/String;

    sget-object v0, Lcom/sma/smartv3/model/AIFunctionCat;->LIFE:Lcom/sma/smartv3/model/AIFunctionCat;

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/fragment/AIFragment;->mCurCat:Lcom/sma/smartv3/model/AIFunctionCat;

    return-void
.end method

.method public static synthetic I0IIOi(Lcom/sma/smartv3/ui/ai/fragment/AIFragment;Lcom/sma/smartv3/model/AIFunction;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/ai/fragment/AIFragment;->showData$lambda$0$0$1$0$0(Lcom/sma/smartv3/ui/ai/fragment/AIFragment;Lcom/sma/smartv3/model/AIFunction;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/ai/fragment/AIFragment;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/ai/fragment/AIFragment;->showData$lambda$0$0$3$0(Lcom/sma/smartv3/ui/ai/fragment/AIFragment;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IO(Lcom/angcyo/dsladapter/DslAdapter;Lcom/sma/smartv3/ui/ai/fragment/AIFragment;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/ai/fragment/AIFragment;->showData$lambda$0$0(Lcom/angcyo/dsladapter/DslAdapter;Lcom/sma/smartv3/ui/ai/fragment/AIFragment;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/ui/ai/fragment/AIFragment;Lcom/sma/smartv3/model/AIFunction;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/ai/fragment/AIFragment;->showAIFunction$lambda$0$0$0(Lcom/sma/smartv3/ui/ai/fragment/AIFragment;Lcom/sma/smartv3/model/AIFunction;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/ai/fragment/AIFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/ai/fragment/AIFragment;->showData$lambda$0(Lcom/sma/smartv3/ui/ai/fragment/AIFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/model/AIFunction;Lcom/sma/smartv3/ui/ai/fragment/AIFragment;Lcom/sma/smartv3/ui/ai/item/AIFunctionItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/ai/fragment/AIFragment;->showData$lambda$0$0$1$0(Lcom/sma/smartv3/model/AIFunction;Lcom/sma/smartv3/ui/ai/fragment/AIFragment;Lcom/sma/smartv3/ui/ai/item/AIFunctionItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIi0(Lcom/sma/smartv3/ui/ai/fragment/AIFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/ai/fragment/AIFragment;->showData$lambda$0$0$3(Lcom/sma/smartv3/ui/ai/fragment/AIFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XO0O10(Lcom/bestmafen/androidbase/dsl/BaseDslItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/fragment/AIFragment;->showData$lambda$0$0$2$0(Lcom/bestmafen/androidbase/dsl/BaseDslItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XOO0ii0(Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/fragment/AIFragment;->showData$lambda$0$0$4(Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/ai/fragment/AIFragment;Lcom/sma/smartv3/model/AIFunction;Lcom/sma/smartv3/ui/ai/item/AIFunctionItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/ai/fragment/AIFragment;->showAIFunction$lambda$0$0(Lcom/sma/smartv3/ui/ai/fragment/AIFragment;Lcom/sma/smartv3/model/AIFunction;Lcom/sma/smartv3/ui/ai/item/AIFunctionItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iO(Lcom/sma/smartv3/ui/ai/item/AITopItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/fragment/AIFragment;->showData$lambda$0$0$0(Lcom/sma/smartv3/ui/ai/item/AITopItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final showAIFunction$lambda$0$0(Lcom/sma/smartv3/ui/ai/fragment/AIFragment;Lcom/sma/smartv3/model/AIFunction;Lcom/sma/smartv3/ui/ai/item/AIFunctionItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/fragment/AIFragment;->ITEM_GROUPS_TAG:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemGroups(Ljava/util/List;)V

    invoke-virtual {p2, p1}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemData(Ljava/lang/Object;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IX1XiI;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/IX1XiI;-><init>(Lcom/sma/smartv3/ui/ai/fragment/AIFragment;Lcom/sma/smartv3/model/AIFunction;)V

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showAIFunction$lambda$0$0$0(Lcom/sma/smartv3/ui/ai/fragment/AIFragment;Lcom/sma/smartv3/model/AIFunction;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object p0

    invoke-static {p0, p1}, Lcom/sma/smartv3/model/AIFunctionDataKt;->toAIFunction(Landroid/app/Activity;Lcom/sma/smartv3/model/AIFunction;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$0(Lcom/sma/smartv3/ui/ai/fragment/AIFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapter;->clearAllItems()V

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, v0, v1}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslViewHolder()Lcom/angcyo/dsladapter/DslViewHolder;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/X0iO;

    invoke-direct {v1, p1, p0}, Lcom/android/mltcode/paycertificationapi/X0iO;-><init>(Lcom/angcyo/dsladapter/DslAdapter;Lcom/sma/smartv3/ui/ai/fragment/AIFragment;)V

    const-wide/16 p0, 0x64

    invoke-virtual {v0, p0, p1, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->postDelay(JLkotlin/jvm/functions/Function0;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$0$0(Lcom/angcyo/dsladapter/DslAdapter;Lcom/sma/smartv3/ui/ai/fragment/AIFragment;)Lkotlin/Unit;
    .locals 7

    new-instance v0, Lcom/sma/smartv3/ui/ai/item/AITopItem;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/ai/item/AITopItem;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iOI;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/iOI;-><init>()V

    invoke-static {p0, v0, v1}, Lcom/angcyo/dsladapter/DslAdapterExKt;->X0O(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;Lkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    invoke-static {}, Lcom/sma/smartv3/model/AIFunctionDataKt;->getHotAIFunction()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    if-gez v1, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_0
    check-cast v2, Lcom/sma/smartv3/model/AIFunction;

    if-nez v1, :cond_1

    new-instance v1, Lcom/sma/smartv3/ui/ai/item/Hot1AIFunctionItem;

    invoke-direct {v1}, Lcom/sma/smartv3/ui/ai/item/Hot1AIFunctionItem;-><init>()V

    goto :goto_1

    :cond_1
    new-instance v1, Lcom/sma/smartv3/ui/ai/item/HotAIFunctionItem;

    invoke-direct {v1}, Lcom/sma/smartv3/ui/ai/item/HotAIFunctionItem;-><init>()V

    :goto_1
    new-instance v4, Lcom/android/mltcode/paycertificationapi/XXiO0i;

    invoke-direct {v4, v2, p1}, Lcom/android/mltcode/paycertificationapi/XXiO0i;-><init>(Lcom/sma/smartv3/model/AIFunction;Lcom/sma/smartv3/ui/ai/fragment/AIFragment;)V

    invoke-static {p0, v1, v4}, Lcom/angcyo/dsladapter/DslAdapterExKt;->X0O(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;Lkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    move v1, v3

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->iOIi00Ii()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p1, Lcom/sma/smartv3/ui/ai/fragment/AIFragment;->bannerItem:Lcom/bestmafen/androidbase/dsl/BaseDslItem;

    if-nez v0, :cond_3

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/ai/fragment/AIFragment;->getAdBannerItem()Lcom/bestmafen/androidbase/dsl/BaseDslItem;

    move-result-object v0

    iput-object v0, p1, Lcom/sma/smartv3/ui/ai/fragment/AIFragment;->bannerItem:Lcom/bestmafen/androidbase/dsl/BaseDslItem;

    :cond_3
    iget-object v0, p1, Lcom/sma/smartv3/ui/ai/fragment/AIFragment;->bannerItem:Lcom/bestmafen/androidbase/dsl/BaseDslItem;

    if-eqz v0, :cond_4

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IX0IXOi;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/IX0IXOi;-><init>()V

    invoke-static {p0, v0, v1}, Lcom/angcyo/dsladapter/DslAdapterExKt;->X0O(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;Lkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    move-result-object v0

    check-cast v0, Lcom/bestmafen/androidbase/dsl/BaseDslItem;

    :cond_4
    new-instance v0, Lcom/android/mltcode/paycertificationapi/O0O;

    invoke-direct {v0, p1}, Lcom/android/mltcode/paycertificationapi/O0O;-><init>(Lcom/sma/smartv3/ui/ai/fragment/AIFragment;)V

    const v1, 0x7f0d0182

    invoke-static {p0, v1, v0}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    iget-object v0, p1, Lcom/sma/smartv3/ui/ai/fragment/AIFragment;->mCurCat:Lcom/sma/smartv3/model/AIFunctionCat;

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/ai/fragment/AIFragment;->showAIFunction(Lcom/sma/smartv3/model/AIFunctionCat;)V

    new-instance v4, Lcom/android/mltcode/paycertificationapi/Xi1i0XOX0;

    invoke-direct {v4}, Lcom/android/mltcode/paycertificationapi/Xi1i0XOX0;-><init>()V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lcom/angcyo/dsladapter/DslAdapter;->render$default(Lcom/angcyo/dsladapter/DslAdapter;ZLcom/angcyo/dsladapter/XIi00iiXO;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$0$0$0(Lcom/sma/smartv3/ui/ai/item/AITopItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemSpanCount(I)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$0$0$1$0(Lcom/sma/smartv3/model/AIFunction;Lcom/sma/smartv3/ui/ai/fragment/AIFragment;Lcom/sma/smartv3/ui/ai/item/AIFunctionItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemData(Ljava/lang/Object;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X111IO;

    invoke-direct {v0, p1, p0}, Lcom/android/mltcode/paycertificationapi/X111IO;-><init>(Lcom/sma/smartv3/ui/ai/fragment/AIFragment;Lcom/sma/smartv3/model/AIFunction;)V

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$0$0$1$0$0(Lcom/sma/smartv3/ui/ai/fragment/AIFragment;Lcom/sma/smartv3/model/AIFunction;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object p0

    invoke-static {p0, p1}, Lcom/sma/smartv3/model/AIFunctionDataKt;->toAIFunction(Landroid/app/Activity;Lcom/sma/smartv3/model/AIFunction;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$0$0$2$0(Lcom/bestmafen/androidbase/dsl/BaseDslItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemSpanCount(I)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$0$0$3(Lcom/sma/smartv3/ui/ai/fragment/AIFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemIsGroupHead(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/fragment/AIFragment;->ITEM_GROUPS_TAG:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemGroups(Ljava/util/List;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemIsHover(Z)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Xii11I;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/Xii11I;-><init>(Lcom/sma/smartv3/ui/ai/fragment/AIFragment;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$0$0$3$0(Lcom/sma/smartv3/ui/ai/fragment/AIFragment;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    const-string p2, "itemHolder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "adapterItem"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "<unused var>"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    const-string p3, "itemView"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    const p4, 0x7f070096

    invoke-virtual {p3, p4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p3

    invoke-static {p2, p3}, Lcom/sma/smartv3/util/UtilsKt;->IX1XiI(Landroid/view/View;F)V

    const p2, 0x7f0a0b64

    invoke-virtual {p1, p2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/tabs/TabLayout;

    if-eqz p1, :cond_0

    new-instance p2, Lcom/sma/smartv3/ui/ai/fragment/AIFragment$OXO1;

    invoke-direct {p2, p0}, Lcom/sma/smartv3/ui/ai/fragment/AIFragment$OXO1;-><init>(Lcom/sma/smartv3/ui/ai/fragment/AIFragment;)V

    invoke-virtual {p1, p2}, Lcom/google/android/material/tabs/TabLayout;->addOnTabSelectedListener(Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$0$0$4(Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 3

    const-string v0, "$this$render"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1, v0}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final getAdBannerItem()Lcom/bestmafen/androidbase/dsl/BaseDslItem;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->O1()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;-><init>()V

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->XXOXi()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lcom/sma/smartv3/ui/ai/item/AIADPBannerItem;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/ai/item/AIADPBannerItem;-><init>()V

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getBannerItem()Lcom/bestmafen/androidbase/dsl/BaseDslItem;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/fragment/AIFragment;->bannerItem:Lcom/bestmafen/androidbase/dsl/BaseDslItem;

    return-object v0
.end method

.method public final getITEM_GROUPS_TAG()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/fragment/AIFragment;->ITEM_GROUPS_TAG:Ljava/lang/String;

    return-object v0
.end method

.method public final getMCurCat()Lcom/sma/smartv3/model/AIFunctionCat;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/fragment/AIFragment;->mCurCat:Lcom/sma/smartv3/model/AIFunctionCat;

    return-object v0
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

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d017a

    return v0
.end method

.method public final onAdStateChange(Ljava/lang/Object;)V
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "AD_STATE_CHANGE"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->IOi1O0()Z

    move-result v1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->IX0iIX()Z

    move-result v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AI Ad State -> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/fragment/AIFragment;->showData()V

    return-void
.end method

.method public onInitBaseLayoutAfter()V
    .locals 4

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->onInitBaseLayoutAfter()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;-><init>(II)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/fragment/AIFragment;->showData()V

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

.method public final setBannerItem(Lcom/bestmafen/androidbase/dsl/BaseDslItem;)V
    .locals 0
    .param p1    # Lcom/bestmafen/androidbase/dsl/BaseDslItem;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/fragment/AIFragment;->bannerItem:Lcom/bestmafen/androidbase/dsl/BaseDslItem;

    return-void
.end method

.method public final setMCurCat(Lcom/sma/smartv3/model/AIFunctionCat;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/model/AIFunctionCat;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/fragment/AIFragment;->mCurCat:Lcom/sma/smartv3/model/AIFunctionCat;

    return-void
.end method

.method public final showAIFunction(Lcom/sma/smartv3/model/AIFunctionCat;)V
    .locals 6
    .param p1    # Lcom/sma/smartv3/model/AIFunctionCat;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "cat"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/sma/smartv3/model/AIFunctionDataKt;->getAIFunctionByCat(Lcom/sma/smartv3/model/AIFunctionCat;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/AIFunction;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/ui/ai/item/AIFunctionItem;

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct {v2, v5, v3, v4}, Lcom/sma/smartv3/ui/ai/item/AIFunctionItem;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/android/mltcode/paycertificationapi/iii0;

    invoke-direct {v3, p0, v0}, Lcom/android/mltcode/paycertificationapi/iii0;-><init>(Lcom/sma/smartv3/ui/ai/fragment/AIFragment;Lcom/sma/smartv3/model/AIFunction;)V

    invoke-static {v1, v2, v3}, Lcom/angcyo/dsladapter/DslAdapterExKt;->X0O(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;Lkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public showData()V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X00O0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X00O0;-><init>(Lcom/sma/smartv3/ui/ai/fragment/AIFragment;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
