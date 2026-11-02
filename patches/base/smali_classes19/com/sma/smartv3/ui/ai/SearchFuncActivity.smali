.class public final Lcom/sma/smartv3/ui/ai/SearchFuncActivity;
.super Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/ai/SearchFuncActivity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSearchFuncActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchFuncActivity.kt\ncom/sma/smartv3/ui/ai/SearchFuncActivity\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,308:1\n55#2,12:309\n84#2,3:321\n1869#3,2:324\n1563#3:329\n1634#3,2:330\n1636#3:333\n1869#3,2:338\n1869#3,2:340\n39#4,3:326\n42#4:332\n44#4,2:334\n31#4,2:336\n31#4,2:342\n*S KotlinDebug\n*F\n+ 1 SearchFuncActivity.kt\ncom/sma/smartv3/ui/ai/SearchFuncActivity\n*L\n74#1:309,12\n74#1:321,3\n175#1:324,2\n187#1:329\n187#1:330,2\n187#1:333\n220#1:338,2\n243#1:340,2\n187#1:326,3\n187#1:332\n187#1:334,2\n269#1:336,2\n293#1:342,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSearchFuncActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchFuncActivity.kt\ncom/sma/smartv3/ui/ai/SearchFuncActivity\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,308:1\n55#2,12:309\n84#2,3:321\n1869#3,2:324\n1563#3:329\n1634#3,2:330\n1636#3:333\n1869#3,2:338\n1869#3,2:340\n39#4,3:326\n42#4:332\n44#4,2:334\n31#4,2:336\n31#4,2:342\n*S KotlinDebug\n*F\n+ 1 SearchFuncActivity.kt\ncom/sma/smartv3/ui/ai/SearchFuncActivity\n*L\n74#1:309,12\n74#1:321,3\n175#1:324,2\n187#1:329\n187#1:330,2\n187#1:333\n220#1:338,2\n243#1:340,2\n187#1:326,3\n187#1:332\n187#1:334,2\n269#1:336,2\n293#1:342,2\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sma/smartv3/ui/ai/SearchFuncActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final SEARCH_FILLING:I = 0xff

.field private static final SEARCH_INITIAL:I = 0xfd

.field private static final SEARCH_RESULT:I = 0xfe


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private isProgrammaticallySet:Z

.field private mAdapterType:I

.field private mAllDeleteTipPopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mRecords:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final searchView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/ui/ai/SearchFuncActivity$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->Companion:Lcom/sma/smartv3/ui/ai/SearchFuncActivity$OXO1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;-><init>()V

    const-string v0, "SearchFunc"

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->TAG:Ljava/lang/String;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/bx3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/bx3;-><init>(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->searchView$delegate:Lkotlin/Lazy;

    const/16 v0, 0xfd

    iput v0, p0, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->mAdapterType:I

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->showData$lambda$0$0$1(Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;Lcom/angcyo/dsladapter/DslAdapter;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->showData$lambda$0$0(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;Lcom/angcyo/dsladapter/DslAdapter;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->showData$lambda$0$0$5(Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->showData$lambda$0$0$3(Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->showDeleteTipPopup$lambda$0$1(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;Ljava/util/List;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->showData$lambda$0(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;Ljava/util/List;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;Lcom/sma/smartv3/model/AIFunction;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->showData$lambda$0$0$4$0$0(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;Lcom/sma/smartv3/model/AIFunction;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/model/AIFunction;Lcom/sma/smartv3/ui/ai/SearchFuncActivity;Lcom/sma/smartv3/ui/ai/item/SearchAIFunctionItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->showData$lambda$0$0$4$0(Lcom/sma/smartv3/model/AIFunction;Lcom/sma/smartv3/ui/ai/SearchFuncActivity;Lcom/sma/smartv3/ui/ai/item/SearchAIFunctionItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/model/AIFunction;Lcom/sma/smartv3/ui/ai/SearchFuncActivity;Lcom/sma/smartv3/ui/ai/item/SearchAIFillingItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->showData$lambda$0$0$2$0(Lcom/sma/smartv3/model/AIFunction;Lcom/sma/smartv3/ui/ai/SearchFuncActivity;Lcom/sma/smartv3/ui/ai/item/SearchAIFillingItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->searchView_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;)Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;Lcom/sma/smartv3/model/AIFunction;Lcom/sma/smartv3/ui/ai/item/SearchAIFillingItem;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->showData$lambda$0$0$2$0$0(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;Lcom/sma/smartv3/model/AIFunction;Lcom/sma/smartv3/ui/ai/item/SearchAIFillingItem;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO()Z
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->showDeleteTipPopup$lambda$0$0()Z

    move-result v0

    return v0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;Lcom/sma/smartv3/model/AIFunction;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->showData$lambda$0$0$2$0$0$0(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;Lcom/sma/smartv3/model/AIFunction;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$editChanged(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;Landroid/text/Editable;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->editChanged(Landroid/text/Editable;)V

    return-void
.end method

.method public static final synthetic access$getSearchView(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->getSearchView()Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTAG$p(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method private final editChanged(Landroid/text/Editable;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0xfd

    goto :goto_0

    :cond_0
    const/16 v0, 0xff

    :goto_0
    iput v0, p0, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->mAdapterType:I

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->notifyDataChanged(Ljava/lang/String;)V

    return-void
.end method

.method private final getSearchView()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->searchView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->showData$lambda$0$0$0(Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic initList$default(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/List;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const-string p1, ""

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->initList(Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final searchView_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;)Landroid/widget/EditText;
    .locals 1

    const v0, 0x7f0a0a01

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/EditText;

    return-object p0
.end method

.method private final showData(Ljava/lang/String;)V
    .locals 3

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->initList(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    const v0, 0x7f0a09c6

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, p0, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->mAdapterType:I

    const/16 v2, 0xfd

    if-eq v1, v2, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/fx3;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/fx3;-><init>(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;Ljava/util/List;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static synthetic showData$default(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const-string p1, ""

    :cond_0
    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->showData(Ljava/lang/String;)V

    return-void
.end method

.method private static final showData$lambda$0(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;Ljava/util/List;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$renderAdapter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/angcyo/dsladapter/DslAdapter;->clearAllItems()V

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p2, v0, v1, v0, v1}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslViewHolder()Lcom/angcyo/dsladapter/DslViewHolder;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/cx3;

    invoke-direct {v1, p0, p2, p1}, Lcom/android/mltcode/paycertificationapi/cx3;-><init>(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;Lcom/angcyo/dsladapter/DslAdapter;Ljava/util/List;)V

    const-wide/16 p0, 0x64

    invoke-virtual {v0, p0, p1, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->postDelay(JLkotlin/jvm/functions/Function0;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$0$0(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;Lcom/angcyo/dsladapter/DslAdapter;Ljava/util/List;)Lkotlin/Unit;
    .locals 6

    iget v0, p0, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->mAdapterType:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_2

    :pswitch_0
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p2, Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;

    iget-object p0, p0, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->mRecords:Ljava/util/List;

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {p2, p0}, Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;-><init>(Ljava/util/List;)V

    new-instance p0, Lcom/android/mltcode/paycertificationapi/kx3;

    invoke-direct {p0}, Lcom/android/mltcode/paycertificationapi/kx3;-><init>()V

    invoke-static {p1, p2, p0}, Lcom/angcyo/dsladapter/DslAdapterExKt;->X0O(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;Lkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    goto :goto_2

    :cond_0
    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/AIFunction;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/ui/ai/item/SearchAIFillingItem;

    invoke-direct {v2}, Lcom/sma/smartv3/ui/ai/item/SearchAIFillingItem;-><init>()V

    new-instance v3, Lcom/android/mltcode/paycertificationapi/lx3;

    invoke-direct {v3, v0, p0}, Lcom/android/mltcode/paycertificationapi/lx3;-><init>(Lcom/sma/smartv3/model/AIFunction;Lcom/sma/smartv3/ui/ai/SearchFuncActivity;)V

    invoke-static {v1, v2, v3}, Lcom/angcyo/dsladapter/DslAdapterExKt;->X0O(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;Lkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    goto :goto_0

    :pswitch_1
    new-instance v0, Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;

    iget-object v1, p0, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->mRecords:Ljava/util/List;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;-><init>(Ljava/util/List;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/mx3;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/mx3;-><init>()V

    invoke-static {p1, v0, v1}, Lcom/angcyo/dsladapter/DslAdapterExKt;->X0O(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;Lkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/AIFunction;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/ui/ai/item/SearchAIFunctionItem;

    invoke-direct {v2}, Lcom/sma/smartv3/ui/ai/item/SearchAIFunctionItem;-><init>()V

    new-instance v3, Lcom/android/mltcode/paycertificationapi/nx3;

    invoke-direct {v3, v0, p0}, Lcom/android/mltcode/paycertificationapi/nx3;-><init>(Lcom/sma/smartv3/model/AIFunction;Lcom/sma/smartv3/ui/ai/SearchFuncActivity;)V

    invoke-static {v1, v2, v3}, Lcom/angcyo/dsladapter/DslAdapterExKt;->X0O(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;Lkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    goto :goto_1

    :pswitch_2
    new-instance p2, Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;

    iget-object p0, p0, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->mRecords:Ljava/util/List;

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {p2, p0}, Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;-><init>(Ljava/util/List;)V

    new-instance p0, Lcom/android/mltcode/paycertificationapi/jx3;

    invoke-direct {p0}, Lcom/android/mltcode/paycertificationapi/jx3;-><init>()V

    invoke-static {p1, p2, p0}, Lcom/angcyo/dsladapter/DslAdapterExKt;->X0O(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;Lkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    :cond_1
    :goto_2
    new-instance v3, Lcom/android/mltcode/paycertificationapi/ox3;

    invoke-direct {v3}, Lcom/android/mltcode/paycertificationapi/ox3;-><init>()V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lcom/angcyo/dsladapter/DslAdapter;->render$default(Lcom/angcyo/dsladapter/DslAdapter;ZLcom/angcyo/dsladapter/XIi00iiXO;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0

    :pswitch_data_0
    .packed-switch 0xfd
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static final showData$lambda$0$0$0(Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemSpanCount(I)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$0$0$1(Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemSpanCount(I)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$0$0$2$0(Lcom/sma/smartv3/model/AIFunction;Lcom/sma/smartv3/ui/ai/SearchFuncActivity;Lcom/sma/smartv3/ui/ai/item/SearchAIFillingItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemData(Ljava/lang/Object;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/gx3;

    invoke-direct {v0, p1, p0, p2}, Lcom/android/mltcode/paycertificationapi/gx3;-><init>(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;Lcom/sma/smartv3/model/AIFunction;Lcom/sma/smartv3/ui/ai/item/SearchAIFillingItem;)V

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$0$0$2$0$0(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;Lcom/sma/smartv3/model/AIFunction;Lcom/sma/smartv3/ui/ai/item/SearchAIFillingItem;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AIFunction;->getTitle()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p3}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->saveRecords(Ljava/lang/String;)V

    new-instance p3, Lcom/android/mltcode/paycertificationapi/ex3;

    invoke-direct {p3, p0, p1}, Lcom/android/mltcode/paycertificationapi/ex3;-><init>(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;Lcom/sma/smartv3/model/AIFunction;)V

    invoke-virtual {p2, p3}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$0$0$2$0$0$0(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;Lcom/sma/smartv3/model/AIFunction;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/sma/smartv3/model/AIFunctionDataKt;->toAIFunction(Landroid/app/Activity;Lcom/sma/smartv3/model/AIFunction;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$0$0$3(Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemSpanCount(I)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$0$0$4$0(Lcom/sma/smartv3/model/AIFunction;Lcom/sma/smartv3/ui/ai/SearchFuncActivity;Lcom/sma/smartv3/ui/ai/item/SearchAIFunctionItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemData(Ljava/lang/Object;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/dx3;

    invoke-direct {v0, p1, p0}, Lcom/android/mltcode/paycertificationapi/dx3;-><init>(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;Lcom/sma/smartv3/model/AIFunction;)V

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$0$0$4$0$0(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;Lcom/sma/smartv3/model/AIFunction;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/sma/smartv3/model/AIFunctionDataKt;->toAIFunction(Landroid/app/Activity;Lcom/sma/smartv3/model/AIFunction;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$0$0$5(Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
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

.method private static final showDeleteTipPopup$lambda$0$0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method private static final showDeleteTipPopup$lambda$0$1(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;)Z
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->mRecords:Ljava/util/List;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_1
    if-eqz v0, :cond_2

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->i0I0O111I(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    :cond_2
    iput-object v1, p0, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->mRecords:Ljava/util/List;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-class v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "_list"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v3, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    const v0, 0x7f1402dd

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->getSearchView()Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->notifyDataChanged(Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public adapterStatusItem()Lcom/angcyo/dsladapter/DslAdapterStatusItem;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/sma/smartv3/dsl/AdapterStatusItem;

    invoke-direct {v0}, Lcom/sma/smartv3/dsl/AdapterStatusItem;-><init>()V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->setAdapterStatus(Lcom/angcyo/dsladapter/DslAdapterStatusItem;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getAdapterStatus()Lcom/angcyo/dsladapter/DslAdapterStatusItem;

    move-result-object v0

    return-object v0
.end method

.method public final clearRecords(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "search_clear_records"
    .end annotation

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->showDeleteTipPopup()V

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

.method public final initList(Ljava/lang/String;)Ljava/util/List;
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/AIFunction;",
            ">;"
        }
    .end annotation

    const-string v0, "newText"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/sma/smartv3/model/AIFunctionDataKt;->getAIFunction()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_1

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/model/AIFunction;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AIFunction;->getTitle()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v3, p1, v4}, Lkotlin/text/StringsKt__StringsKt;->iOiXX(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public initView()V
    .locals 10

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->initView()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->transparentStatusBar()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v1, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->getSearchView()Landroid/widget/EditText;

    move-result-object v0

    const-string v1, "<get-searchView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/ui/ai/SearchFuncActivity$XIi00iiXO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->getSearchView()Landroid/widget/EditText;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/ai/SearchFuncActivity$iO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity$iO;-><init>(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    const-string v0, ""

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->notifyDataChanged(Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->IX0iIX()Z

    move-result v1

    const-string v2, " -> id:"

    if-eqz v1, :cond_0

    const v0, 0x7f0a0097

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

    if-eqz v3, :cond_1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->TAG:Ljava/lang/String;

    invoke-virtual {v3}, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;->getAdUnitId()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v0, Lcom/sma/smartv3/ui/ai/SearchFuncActivity$XO0O10;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity$XO0O10;-><init>(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;)V

    invoke-virtual {v3, v0}, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;->setAdListener(Lcom/sma/smartv3/biz/ad/ADPCAdListener;)V

    const/16 v8, 0xf

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;->loadAdView$default(Lcom/sma/smartv3/view/ad/ADPCAdContainerView;Ljava/lang/String;IZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->IOi1O0()Z

    move-result v0

    if-eqz v0, :cond_1

    const v0, 0x7f0a008b

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/sma/smartv3/view/ad/ADPAdContainerView;

    if-eqz v3, :cond_1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->TAG:Ljava/lang/String;

    invoke-virtual {v3}, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->getAdUnitId()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v0, Lcom/sma/smartv3/ui/ai/SearchFuncActivity$O00;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity$O00;-><init>(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;)V

    invoke-virtual {v3, v0}, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->setAdListener(Lcom/sma/smartv3/biz/ad/ADPAdListener;)V

    const/16 v8, 0xf

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->loadAdView$default(Lcom/sma/smartv3/view/ad/ADPAdContainerView;Ljava/lang/String;IZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final isProgrammaticallySet()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->isProgrammaticallySet:Z

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00f6

    return v0
.end method

.method public final notifyDataChanged(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->showData(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method public final onCodePairChange(Ljava/lang/String;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "search_top_change"
    .end annotation

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xfe

    iput v0, p0, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->mAdapterType:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->isProgrammaticallySet:Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->getSearchView()Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->saveRecords(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->getSearchView()Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setSelection(I)V

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->isProgrammaticallySet:Z

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->initList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-ne v3, v0, :cond_0

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/AIFunction;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AIFunction;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/model/AIFunction;

    invoke-static {p0, p1}, Lcom/sma/smartv3/model/AIFunctionDataKt;->toAIFunction(Landroid/app/Activity;Lcom/sma/smartv3/model/AIFunction;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->notifyDataChanged(Ljava/lang/String;)V

    return-void
.end method

.method public onResume()V
    .locals 5

    const-class v0, Ljava/lang/String;

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v1

    if-eqz v1, :cond_1

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "_list"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/gson/JsonParser;->parseString(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/gson/JsonElement;->getAsJsonArray()Lcom/google/gson/JsonArray;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/gson/JsonElement;

    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v4, v3, v0}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v2

    :cond_0
    iput-object v2, p0, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->mRecords:Ljava/util/List;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_1
    return-void
.end method

.method public final onSearch(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->getSearchView()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0xfe

    iput v0, p0, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->mAdapterType:I

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->saveRecords(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->notifyDataChanged(Ljava/lang/String;)V

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

.method public final saveRecords(Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->mRecords:Ljava/util/List;

    if-eqz v0, :cond_0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/16 v2, 0xa

    if-le v1, v2, :cond_1

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    :cond_1
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object p1, v0

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->i0I0O111I(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->mRecords:Ljava/util/List;

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-class v2, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_list"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v2, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public final setProgrammaticallySet(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->isProgrammaticallySet:Z

    return-void
.end method

.method public final showDeleteTipPopup()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->mAllDeleteTipPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p0, v3, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v1, 0x7f141348

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v1, 0x7f1402d3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->iX(Ljava/lang/Integer;)V

    const v1, 0x7f14027f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/hx3;

    invoke-direct {v2}, Lcom/android/mltcode/paycertificationapi/hx3;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ix3;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/ix3;-><init>(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;)V

    const v2, 0x7f14034b

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->mAllDeleteTipPopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->mAllDeleteTipPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_1
    return-void
.end method
