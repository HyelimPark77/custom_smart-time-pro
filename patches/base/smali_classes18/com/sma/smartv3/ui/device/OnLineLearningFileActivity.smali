.class public final Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;
.super Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nOnLineLearningFileActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnLineLearningFileActivity.kt\ncom/sma/smartv3/ui/device/OnLineLearningFileActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,356:1\n50#2,3:357\n53#2:363\n55#2,2:365\n1563#3:360\n1634#3,2:361\n1636#3:364\n1563#3:367\n1634#3,3:368\n1869#3,2:371\n1761#3,3:373\n*S KotlinDebug\n*F\n+ 1 OnLineLearningFileActivity.kt\ncom/sma/smartv3/ui/device/OnLineLearningFileActivity\n*L\n61#1:357,3\n61#1:363\n61#1:365,2\n61#1:360\n61#1:361,2\n61#1:364\n332#1:367\n332#1:368,3\n134#1:371,2\n188#1:373,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nOnLineLearningFileActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnLineLearningFileActivity.kt\ncom/sma/smartv3/ui/device/OnLineLearningFileActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,356:1\n50#2,3:357\n53#2:363\n55#2,2:365\n1563#3:360\n1634#3,2:361\n1636#3:364\n1563#3:367\n1634#3,3:368\n1869#3,2:371\n1761#3,3:373\n*S KotlinDebug\n*F\n+ 1 OnLineLearningFileActivity.kt\ncom/sma/smartv3/ui/device/OnLineLearningFileActivity\n*L\n61#1:357,3\n61#1:363\n61#1:365,2\n61#1:360\n61#1:361,2\n61#1:364\n332#1:367\n332#1:368,3\n134#1:371,2\n188#1:373,3\n*E\n"
    }
.end annotation


# instance fields
.field private final fixedItemList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/angcyo/dsladapter/DslAdapterItem;",
            ">;"
        }
    .end annotation
.end field

.field private isSelectorAll:Z

.field private mAlreadyHaveList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/AudioBookItem;",
            ">;"
        }
    .end annotation
.end field

.field private final mButton$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mChooseAudioBookItem:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/AudioBookItem;",
            ">;"
        }
    .end annotation
.end field

.field private mChooseNumber:I

.field private final mFileTypeFiles:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/LearnCardItemList;",
            ">;"
        }
    .end annotation
.end field

.field private final mOnLineAudioBookItemFiles:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/AudioBookItem;",
            ">;"
        }
    .end annotation
.end field

.field private final openChooseType:Z

.field private final tvFreeSpace$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/sg1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/sg1;-><init>(Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->tvFreeSpace$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/tg1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/tg1;-><init>(Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->mButton$delegate:Lkotlin/Lazy;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->openChooseType:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->mChooseAudioBookItem:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->mAlreadyHaveList:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->mOnLineAudioBookItemFiles:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->mFileTypeFiles:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->fixedItemList:Ljava/util/List;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/model/AudioBookItem;Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->showLearningData$lambda$0$0(Lcom/sma/smartv3/model/AudioBookItem;Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1(Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->showAudioBookList$lambda$0(Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->showLearnCardList$lambda$0$0(Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->showLearningData$lambda$0$0$0$1(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/model/AudioBookItem;Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;Landroid/widget/ImageView;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->showLearningData$lambda$0$0$0$2(Lcom/sma/smartv3/model/AudioBookItem;Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;Landroid/widget/ImageView;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->mButton_delegate$lambda$0(Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->showLearnCardList$lambda$0(Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/angcyo/dsladapter/DslAdapter;Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->showLearnCardList$lambda$0$0$1$0$1(Lcom/angcyo/dsladapter/DslAdapter;Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X01IiOiIi(Lcom/sma/smartv3/model/AudioBookItem;Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->showLearningData$lambda$0$0$0(Lcom/sma/smartv3/model/AudioBookItem;Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/model/LearnCardItemList;Lcom/sma/smartv3/model/LearnCardDataItem;Lcom/angcyo/dsladapter/DslAdapter;Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->showLearnCardList$lambda$0$0$1(Lcom/sma/smartv3/model/LearnCardItemList;Lcom/sma/smartv3/model/LearnCardDataItem;Lcom/angcyo/dsladapter/DslAdapter;Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->tvFreeSpace_delegate$lambda$0(Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/model/LearnCardDataItem;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->showLearnCardList$lambda$0$0$1$0$0(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/model/LearnCardDataItem;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/model/LearnCardItemList;Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->showLearnCardList$lambda$0$0$0$0(Lcom/sma/smartv3/model/LearnCardItemList;Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/angcyo/dsladapter/DslAdapterItem;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->showLearnCardList$lambda$0$0$0$0$0(Lcom/angcyo/dsladapter/DslAdapterItem;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/model/LearnCardDataItem;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslAdapter;Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p7}, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->showLearnCardList$lambda$0$0$1$0(Lcom/sma/smartv3/model/LearnCardDataItem;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslAdapter;Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private final getAppStoreBinOnlinePath(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    return-object p1
.end method

.method private final getTvFreeSpace()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->tvFreeSpace$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->showLearningData$lambda$0(Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOOX010X(Lcom/sma/smartv3/model/LearnCardItemList;Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->showLearnCardList$lambda$0$0$0(Lcom/sma/smartv3/model/LearnCardItemList;Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final mButton_delegate$lambda$0(Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;)Landroid/widget/Button;
    .locals 1

    const v0, 0x7f0a08c5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private final setViewBg(Landroid/view/View;FFFF)V
    .locals 3

    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/16 v1, 0x8

    new-array v1, v1, [F

    const/4 v2, 0x0

    aput p2, v1, v2

    const/4 v2, 0x1

    aput p2, v1, v2

    const/4 p2, 0x2

    aput p4, v1, p2

    const/4 p2, 0x3

    aput p4, v1, p2

    const/4 p2, 0x4

    aput p5, v1, p2

    const/4 p2, 0x5

    aput p5, v1, p2

    const/4 p2, 0x6

    aput p3, v1, p2

    const/4 p2, 0x7

    aput p3, v1, p2

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const p3, 0x7f06004f

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getColor(I)I

    move-result p2

    invoke-virtual {v0, p2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method

.method private static final showAudioBookList$lambda$0(Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;Ljava/util/List;)Lkotlin/Unit;
    .locals 14

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->mOnLineAudioBookItemFiles:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/angcyo/dsladapter/DslAdapter;->getItemSelectorHelper()Lcom/angcyo/dsladapter/ItemSelectorHelper;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/q04;

    const/4 v2, 0x0

    invoke-static {v2}, Lcom/angcyo/dsladapter/ItemSelectorHelperKt;->XiOIii1(Z)I

    move-result v3

    const/16 v12, 0x3fd

    const/4 v13, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v1 .. v13}, Lcom/android/mltcode/paycertificationapi/q04;-><init>(Lcom/angcyo/dsladapter/DslAdapterItem;IZZZLjava/lang/Object;ZZZLjava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1}, Lcom/angcyo/dsladapter/ItemSelectorHelper;->O1O(Lcom/android/mltcode/paycertificationapi/q04;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/angcyo/dsladapter/DslAdapter;->getItemSelectorHelper()Lcom/angcyo/dsladapter/ItemSelectorHelper;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/angcyo/dsladapter/ItemSelectorHelper;->X11iII1O1(I)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/AppFileDetail;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->mOnLineAudioBookItemFiles:Ljava/util/List;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppFileDetail;->getAppPreImg()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppFileDetail;->getAppName()Ljava/lang/String;

    move-result-object v2

    :goto_1
    move-object v4, v2

    goto :goto_2

    :cond_0
    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppFileDetail;->getAppGroupName()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :goto_2
    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppFileDetail;->getAppSize()D

    move-result-wide v2

    const/16 v5, 0x400

    int-to-double v5, v5

    mul-double/2addr v2, v5

    double-to-int v5, v2

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppFileDetail;->getAppPack()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->getAppStoreBinOnlinePath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppFileDetail;->getAppNewFlag()Z

    move-result v9

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppFileDetail;->getAppPackName()Ljava/lang/String;

    move-result-object v10

    new-instance v2, Lcom/sma/smartv3/model/AudioBookItem;

    const/16 v12, 0x109

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v2 .. v13}, Lcom/sma/smartv3/model/AudioBookItem;-><init>(ILjava/lang/String;IZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->showLearningData()V

    :cond_2
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showLearnCardList$lambda$0(Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;Ljava/util/List;)Lkotlin/Unit;
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapter;->resetItem(Ljava/util/List;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/lg1;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/lg1;-><init>(Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;)V

    invoke-virtual {p0, p1}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showLearnCardList$lambda$0$0(Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 8

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapter;->getItemSelectorHelper()Lcom/angcyo/dsladapter/ItemSelectorHelper;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/angcyo/dsladapter/ItemSelectorHelper;->X11iII1O1(I)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, v0, v1}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->mFileTypeFiles:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sma/smartv3/model/LearnCardItemList;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/LearnCardItemList;->getList()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v4

    new-instance v5, Lcom/android/mltcode/paycertificationapi/ug1;

    invoke-direct {v5, v3, p0}, Lcom/android/mltcode/paycertificationapi/ug1;-><init>(Lcom/sma/smartv3/model/LearnCardItemList;Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;)V

    const v6, 0x7f0d0eed

    invoke-static {v4, v6, v5}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    :cond_1
    invoke-virtual {v3}, Lcom/sma/smartv3/model/LearnCardItemList;->getList()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/sma/smartv3/model/LearnCardDataItem;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v6

    new-instance v7, Lcom/android/mltcode/paycertificationapi/vg1;

    invoke-direct {v7, v3, v5, p1, p0}, Lcom/android/mltcode/paycertificationapi/vg1;-><init>(Lcom/sma/smartv3/model/LearnCardItemList;Lcom/sma/smartv3/model/LearnCardDataItem;Lcom/angcyo/dsladapter/DslAdapter;Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;)V

    const v5, 0x7f0d0eee

    invoke-static {v6, v5, v7}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    invoke-static {p1, p0, v1, v0, v1}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showLearnCardList$lambda$0$0$0(Lcom/sma/smartv3/model/LearnCardItemList;Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemIsGroupHead(Z)V

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemIsHover(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/model/LearnCardItemList;->getTypeName()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemGroups(Ljava/util/List;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ig1;

    invoke-direct {v0, p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/ig1;-><init>(Lcom/sma/smartv3/model/LearnCardItemList;Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)V

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/model/LearnCardItemList;->getTypeName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemTag(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showLearnCardList$lambda$0$0$0$0(Lcom/sma/smartv3/model/LearnCardItemList;Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    const-string p4, "itemHolder"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "<unused var>"

    invoke-static {p5, p4}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p6, p4}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p4, 0x7f0a0693

    invoke-virtual {p3, p4}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p4

    if-eqz p4, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/model/LearnCardItemList;->getTypeName()Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p4, p5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    const p4, 0x7f0a0692

    invoke-virtual {p3, p4}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p4

    if-eqz p4, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/model/LearnCardItemList;->getList()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    const p5, 0x7f140e01

    invoke-virtual {p1, p5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    new-instance p5, Ljava/lang/StringBuilder;

    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p5, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p4, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    const p0, 0x7f0a0690

    invoke-virtual {p3, p0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_2

    const/16 p1, 0x8

    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    const p0, 0x7f0a0691

    invoke-virtual {p3, p0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    if-eqz p0, :cond_4

    invoke-virtual {p2}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemGroupExtend()Z

    move-result p1

    if-eqz p1, :cond_3

    const p1, 0x7f081425

    goto :goto_0

    :cond_3
    const p1, 0x7f081426

    :goto_0
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_4
    if-eqz p0, :cond_5

    new-instance p1, Lcom/android/mltcode/paycertificationapi/fg1;

    invoke-direct {p1, p2}, Lcom/android/mltcode/paycertificationapi/fg1;-><init>(Lcom/angcyo/dsladapter/DslAdapterItem;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_5
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showLearnCardList$lambda$0$0$0$0$0(Lcom/angcyo/dsladapter/DslAdapterItem;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemGroupExtend()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemGroupExtend(Z)V

    return-void
.end method

.method private static final showLearnCardList$lambda$0$0$1(Lcom/sma/smartv3/model/LearnCardItemList;Lcom/sma/smartv3/model/LearnCardDataItem;Lcom/angcyo/dsladapter/DslAdapter;Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/model/LearnCardItemList;->getTypeName()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {p4, p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemGroups(Ljava/util/List;)V

    new-instance p0, Lcom/android/mltcode/paycertificationapi/qg1;

    invoke-direct {p0, p1, p4, p2, p3}, Lcom/android/mltcode/paycertificationapi/qg1;-><init>(Lcom/sma/smartv3/model/LearnCardDataItem;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslAdapter;Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;)V

    invoke-virtual {p4, p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showLearnCardList$lambda$0$0$1$0(Lcom/sma/smartv3/model/LearnCardDataItem;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslAdapter;Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    const-string p5, "itemHolder"

    invoke-static {p4, p5}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "adapterItem"

    invoke-static {p6, p5}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "payloads"

    invoke-static {p7, p5}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p5, 0x7f0a05fc

    invoke-virtual {p4, p5}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object p5

    if-eqz p5, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/model/LearnCardDataItem;->getPath()I

    move-result p6

    invoke-virtual {p5, p6}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_0
    const p5, 0x7f0a0bf7

    invoke-virtual {p4, p5}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p5

    if-eqz p5, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/model/LearnCardDataItem;->getName()Ljava/lang/String;

    move-result-object p6

    invoke-virtual {p5, p6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    const p5, 0x7f0a00e5

    invoke-virtual {p4, p5}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p5

    if-eqz p5, :cond_2

    const-string p6, ""

    invoke-virtual {p5, p6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    const p5, 0x7f0a06b2

    invoke-virtual {p4, p5}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object p5

    if-eqz p5, :cond_3

    const/4 p6, 0x0

    invoke-virtual {p5, p6}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_3
    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemIsSelected()Z

    move-result p6

    if-eqz p6, :cond_4

    invoke-virtual {p0}, Lcom/sma/smartv3/model/LearnCardDataItem;->isChoose()Z

    move-result p6

    if-eqz p6, :cond_4

    invoke-static {p5}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p6

    invoke-static {p6}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object p6

    const p7, 0x7f080711

    invoke-static {p7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p7

    invoke-virtual {p6, p7}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Integer;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p6

    invoke-virtual {p6, p5}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    goto :goto_0

    :cond_4
    invoke-static {p5}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p6

    invoke-static {p6}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object p6

    const p7, 0x7f080712

    invoke-static {p7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p7

    invoke-virtual {p6, p7}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Integer;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p6

    invoke-virtual {p6, p5}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    :goto_0
    iget-object p4, p4, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    new-instance p5, Lcom/android/mltcode/paycertificationapi/gg1;

    invoke-direct {p5, p1, p0}, Lcom/android/mltcode/paycertificationapi/gg1;-><init>(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/model/LearnCardDataItem;)V

    invoke-virtual {p4, p5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance p0, Lcom/android/mltcode/paycertificationapi/hg1;

    invoke-direct {p0, p2, p3}, Lcom/android/mltcode/paycertificationapi/hg1;-><init>(Lcom/angcyo/dsladapter/DslAdapter;Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;)V

    invoke-virtual {p2, p0}, Lcom/angcyo/dsladapter/DslAdapter;->setOnDispatchUpdatesAfterOnce(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showLearnCardList$lambda$0$0$1$0$0(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/model/LearnCardDataItem;Landroid/view/View;)V
    .locals 3

    invoke-virtual {p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemIsSelected()Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, p2, v2, v0, v1}, Lcom/angcyo/dsladapter/DslAdapterItem;->updateItemSelector$default(Lcom/angcyo/dsladapter/DslAdapterItem;ZZILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemIsSelected()Z

    move-result p0

    invoke-virtual {p1, p0}, Lcom/sma/smartv3/model/LearnCardDataItem;->setChoose(Z)V

    return-void
.end method

.method private static final showLearnCardList$lambda$0$0$1$0$1(Lcom/angcyo/dsladapter/DslAdapter;Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/angcyo/dsladapter/DslAdapter;->getItemSelectorHelper()Lcom/angcyo/dsladapter/ItemSelectorHelper;

    move-result-object p0

    iget-object p1, p1, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->fixedItemList:Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/angcyo/dsladapter/ItemSelectorHelper;->iI(Ljava/util/List;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showLearningData$lambda$0(Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 3

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->mOnLineAudioBookItemFiles:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/AudioBookItem;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/jg1;

    invoke-direct {v2, v0, p0}, Lcom/android/mltcode/paycertificationapi/jg1;-><init>(Lcom/sma/smartv3/model/AudioBookItem;Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;)V

    const v0, 0x7f0d0eee

    invoke-static {v1, v0, v2}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    goto :goto_0

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showLearningData$lambda$0$0(Lcom/sma/smartv3/model/AudioBookItem;Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/mg1;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/mg1;-><init>(Lcom/sma/smartv3/model/AudioBookItem;Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;)V

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showLearningData$lambda$0$0$0(Lcom/sma/smartv3/model/AudioBookItem;Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 9

    const-string v0, "itemHolder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adapterItem"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<unused var>"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a0bf7

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AudioBookItem;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    const v0, 0x7f0a00e5

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AudioBookItem;->getSize()I

    move-result v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "kb"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    const/4 v4, 0x0

    const/high16 v5, 0x41a00000    # 20.0f

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->setViewBg(Landroid/view/View;FFFF)V

    const v1, 0x7f0a00e6

    invoke-virtual {p2, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v1

    const v2, 0x7f0a05fc

    invoke-virtual {p2, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object v3

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AudioBookItem;->getOnlinePath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/String;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    :cond_2
    const v2, 0x7f0a06b2

    invoke-virtual {p2, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object v6

    if-eqz v1, :cond_8

    iget-object v2, p1, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->mAlreadyHaveList:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    instance-of v3, v2, Ljava/util/Collection;

    const/4 v7, 0x0

    const/16 v8, 0x8

    if-eqz v3, :cond_3

    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_0

    :cond_3
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sma/smartv3/model/AudioBookItem;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/AudioBookItem;->getOnlinePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AudioBookItem;->getOnlinePath()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const v2, 0x7f140176

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/high16 v2, 0x41a00000    # 20.0f

    const/4 v3, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->setViewBg(Landroid/view/View;FFFF)V

    iget-object v0, p2, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/ng1;

    invoke-direct {v2}, Lcom/android/mltcode/paycertificationapi/ng1;-><init>()V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    if-eqz v6, :cond_7

    invoke-virtual {v6, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    :cond_5
    :goto_0
    iget-object v2, p2, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    new-instance v3, Lcom/android/mltcode/paycertificationapi/og1;

    invoke-direct {v3, p0, p1, v6}, Lcom/android/mltcode/paycertificationapi/og1;-><init>(Lcom/sma/smartv3/model/AudioBookItem;Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;Landroid/widget/ImageView;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    if-eqz v6, :cond_6

    invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_6
    move v7, v8

    :cond_7
    :goto_1
    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    :cond_8
    sget-object v0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object v0
.end method

.method private static final showLearningData$lambda$0$0$0$1(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method private static final showLearningData$lambda$0$0$0$2(Lcom/sma/smartv3/model/AudioBookItem;Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;Landroid/widget/ImageView;Landroid/view/View;)V
    .locals 1

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AudioBookItem;->isChoose()Z

    move-result p3

    const/4 v0, 0x1

    xor-int/2addr p3, v0

    invoke-virtual {p0, p3}, Lcom/sma/smartv3/model/AudioBookItem;->setChoose(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AudioBookItem;->isChoose()Z

    move-result p0

    if-eqz p0, :cond_0

    iget p0, p1, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->mChooseNumber:I

    add-int/2addr p0, v0

    iput p0, p1, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->mChooseNumber:I

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object p0

    const p3, 0x7f080711

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p0, p3}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Integer;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    goto :goto_0

    :cond_0
    iget p0, p1, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->mChooseNumber:I

    add-int/lit8 p0, p0, -0x1

    iput p0, p1, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->mChooseNumber:I

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object p0

    const p3, 0x7f080712

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p0, p3}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Integer;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    :goto_0
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->getMButton()Landroid/widget/Button;

    move-result-object p0

    iget p1, p1, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->mChooseNumber:I

    if-lez p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p0, v0}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method

.method private static final tvFreeSpace_delegate$lambda$0(Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0c82

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public final getFixedItemList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/angcyo/dsladapter/DslAdapterItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->fixedItemList:Ljava/util/List;

    return-object v0
.end method

.method public final getMAlreadyHaveList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/AudioBookItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->mAlreadyHaveList:Ljava/util/List;

    return-object v0
.end method

.method public final getMButton()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->mButton$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method public final getMChooseAudioBookItem()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/AudioBookItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->mChooseAudioBookItem:Ljava/util/List;

    return-object v0
.end method

.method public final getMChooseNumber()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->mChooseNumber:I

    return v0
.end method

.method public final getMFileTypeFiles()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/LearnCardItemList;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->mFileTypeFiles:Ljava/util/List;

    return-object v0
.end method

.method public final getMOnLineAudioBookItemFiles()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/AudioBookItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->mOnLineAudioBookItemFiles:Ljava/util/List;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->XO0O10()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "AUDIO_BOOK_ALREADY_HAVE"

    :try_start_0
    invoke-virtual {p1, v0}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/gson/JsonParser;->parseString(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->getAsJsonArray()Lcom/google/gson/JsonArray;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/gson/JsonElement;

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    const-class v3, Lcom/sma/smartv3/model/AudioBookItem;

    invoke-virtual {v2, v1, v3}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v0

    :cond_0
    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->mAlreadyHaveList:Ljava/util/List;

    return-void
.end method

.method public initView()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->initView()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->mChooseNumber:I

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->getMButton()Landroid/widget/Button;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setEnabled(Z)V

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v1

    if-nez v1, :cond_0

    const v1, 0x7f140d39

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const v1, 0x7f140d41

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->getTvFreeSpace()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final isSelectorAll()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->isSelectorAll:Z

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00d7

    return v0
.end method

.method public final onBottomClick(Landroid/view/View;)V
    .locals 4
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->mChooseAudioBookItem:Ljava/util/List;

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_0
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->mChooseAudioBookItem:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->mOnLineAudioBookItemFiles:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/model/AudioBookItem;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AudioBookItem;->isChoose()Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->mChooseAudioBookItem:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    sget-object v2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->mChooseAudioBookItem:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "chooseItem"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/4 v0, -0x1

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onDestroy()V
    .locals 0

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    return-void
.end method

.method public onInitBaseLayoutAfter()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->onInitBaseLayoutAfter()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->selectorListener()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->showAudioBookList()V

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

.method public final selectorListener()V
    .locals 2

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/angcyo/dsladapter/DslAdapter;->getItemSelectorHelper()Lcom/angcyo/dsladapter/ItemSelectorHelper;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity$OXO1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;)V

    invoke-virtual {v0, v1}, Lcom/angcyo/dsladapter/ItemSelectorHelper;->iX1O1(Lcom/angcyo/dsladapter/iO;)V

    return-void
.end method

.method public final setMAlreadyHaveList(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/AudioBookItem;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->mAlreadyHaveList:Ljava/util/List;

    return-void
.end method

.method public final setMChooseAudioBookItem(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/AudioBookItem;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->mChooseAudioBookItem:Ljava/util/List;

    return-void
.end method

.method public final setMChooseNumber(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->mChooseNumber:I

    return-void
.end method

.method public final setSelectorAll(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;->isSelectorAll:Z

    return-void
.end method

.method public final showAudioBookList()V
    .locals 3

    sget-object v0, Lcom/sma/smartv3/model/AppStoreFileManager;->INSTANCE:Lcom/sma/smartv3/model/AppStoreFileManager;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "2"

    goto :goto_0

    :cond_0
    const-string v1, "3"

    :goto_0
    new-instance v2, Lcom/android/mltcode/paycertificationapi/rg1;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/rg1;-><init>(Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;)V

    invoke-virtual {v0, v1, v2}, Lcom/sma/smartv3/model/AppStoreFileManager;->getAudioBookFileList(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final showLearnCardList()V
    .locals 3

    sget-object v0, Lcom/sma/smartv3/model/AppStoreFileManager;->INSTANCE:Lcom/sma/smartv3/model/AppStoreFileManager;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/pg1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/pg1;-><init>(Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;)V

    const-string v2, "3"

    invoke-virtual {v0, v2, v1}, Lcom/sma/smartv3/model/AppStoreFileManager;->getAppStoreFileList(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final showLearningData()V
    .locals 2

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v1}, Lcom/angcyo/dsladapter/DslAdapter;->resetItem(Ljava/util/List;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/kg1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/kg1;-><init>(Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
