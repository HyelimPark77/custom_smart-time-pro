.class public Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;
.super Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nChooseLanguageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChooseLanguageActivity.kt\ncom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,245:1\n774#2:246\n865#2,2:247\n1563#2:252\n1634#2,2:253\n1636#2:256\n1761#2,3:259\n1563#2:279\n1634#2,3:280\n1869#2,2:283\n39#3,3:249\n42#3:255\n44#3,2:257\n31#3,2:262\n55#4,12:264\n84#4,3:276\n*S KotlinDebug\n*F\n+ 1 ChooseLanguageActivity.kt\ncom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity\n*L\n61#1:246\n61#1:247,2\n70#1:252\n70#1:253,2\n70#1:256\n77#1:259,3\n150#1:279\n150#1:280,3\n155#1:283,2\n70#1:249,3\n70#1:255\n70#1:257,2\n86#1:262,2\n103#1:264,12\n103#1:276,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nChooseLanguageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChooseLanguageActivity.kt\ncom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,245:1\n774#2:246\n865#2,2:247\n1563#2:252\n1634#2,2:253\n1636#2:256\n1761#2,3:259\n1563#2:279\n1634#2,3:280\n1869#2,2:283\n39#3,3:249\n42#3:255\n44#3,2:257\n31#3,2:262\n55#4,12:264\n84#4,3:276\n*S KotlinDebug\n*F\n+ 1 ChooseLanguageActivity.kt\ncom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity\n*L\n61#1:246\n61#1:247,2\n70#1:252\n70#1:253,2\n70#1:256\n77#1:259,3\n150#1:279\n150#1:280,3\n155#1:283,2\n70#1:249,3\n70#1:255\n70#1:257,2\n86#1:262,2\n103#1:264,12\n103#1:276,3\n*E\n"
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private isSelectorAll:Z

.field private mAllLanguageList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/LanguageTranslationData;",
            ">;"
        }
    .end annotation
.end field

.field private mHistoryLanguageList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/LanguageTranslationData;",
            ">;"
        }
    .end annotation
.end field

.field public mLanguageTranslationData:Lcom/sma/smartv3/model/LanguageTranslationData;

.field private final mSearchEdit$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mSearchIcon$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mType:I

.field private textChangedLastTime:J


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;-><init>()V

    const-string v0, "ChooseLanguageActivity"

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->TAG:Ljava/lang/String;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Ii10X;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/Ii10X;-><init>(Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->mSearchEdit$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i1i0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i1i0;-><init>(Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->mSearchIcon$delegate:Lkotlin/Lazy;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->mAllLanguageList:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->mHistoryLanguageList:Ljava/util/List;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->mSearchIcon_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/model/LanguageTranslationData;Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->setData$lambda$0$0$1(Lcom/sma/smartv3/model/LanguageTranslationData;Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;Lcom/sma/smartv3/model/LanguageTranslationData;Landroid/widget/ImageView;Lcom/angcyo/dsladapter/DslAdapter;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->setData$lambda$0$0$1$0$0(Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;Lcom/sma/smartv3/model/LanguageTranslationData;Landroid/widget/ImageView;Lcom/angcyo/dsladapter/DslAdapter;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic O10IXXX0X(Ljava/util/Set;Lcom/sma/smartv3/model/LanguageTranslationData;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->onInitBaseLayoutAfter$lambda$1(Ljava/util/Set;Lcom/sma/smartv3/model/LanguageTranslationData;)Z

    move-result p0

    return p0
.end method

.method public static synthetic OiIIX101O(Ljava/util/List;Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->setData$lambda$0$0(Ljava/util/List;Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;Ljava/util/List;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->setData$lambda$0(Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;Ljava/util/List;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/model/LanguageTranslationData;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->setData$lambda$0$0$0(Lcom/sma/smartv3/model/LanguageTranslationData;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->initView$lambda$1(Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/model/LanguageTranslationData;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->setData$lambda$0$0$0$0(Lcom/sma/smartv3/model/LanguageTranslationData;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->mSearchEdit_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;)Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->setData$lambda$0$0$2(Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private final getLanguageList()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/LanguageTranslationData;",
            ">;"
        }
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->mType:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    invoke-static {}, Lcom/sma/smartv3/model/LanguageTranslationKt;->getTranslationLanguageList()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Lcom/sma/smartv3/ui/translate/sparkchain/XO0O10;->IO:Lcom/sma/smartv3/ui/translate/sparkchain/XO0O10$OXO1;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/translate/sparkchain/XO0O10$OXO1;->XIi00iiXO()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_1
    sget-object v0, Lcom/sma/smartv3/ui/translate/sparkchain/XO0O10;->IO:Lcom/sma/smartv3/ui/translate/sparkchain/XO0O10$OXO1;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/translate/sparkchain/XO0O10$OXO1;->iO()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_2
    sget-object v0, Lcom/sma/smartv3/util/FileTransferTextManager;->OXO1:Lcom/sma/smartv3/util/FileTransferTextManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/util/FileTransferTextManager;->iO()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_3
    invoke-static {}, Lcom/sma/smartv3/model/LanguageTranslationKt;->getCallTranslationLanguageList()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/model/LanguageTranslationData;Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->setData$lambda$0$0$1$0(Lcom/sma/smartv3/model/LanguageTranslationData;Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->getMSearchEdit()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->searchName(Ljava/lang/String;)V

    return-void
.end method

.method private static final mSearchEdit_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;)Landroid/widget/EditText;
    .locals 1

    const v0, 0x7f0a0240

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/EditText;

    return-object p0
.end method

.method private static final mSearchIcon_delegate$lambda$0(Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a023f

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$1(Ljava/util/Set;Lcom/sma/smartv3/model/LanguageTranslationData;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final setData$lambda$0(Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;Ljava/util/List;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$renderAdapter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/angcyo/dsladapter/DslAdapter;->clearAllItems()V

    invoke-virtual {p2}, Lcom/angcyo/dsladapter/DslAdapter;->getItemSelectorHelper()Lcom/angcyo/dsladapter/ItemSelectorHelper;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/angcyo/dsladapter/ItemSelectorHelper;->X11iII1O1(I)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p2, v0, v1, v0, v1}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslViewHolder()Lcom/angcyo/dsladapter/DslViewHolder;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OO0X0X0;

    invoke-direct {v1, p1, p0, p2}, Lcom/android/mltcode/paycertificationapi/OO0X0X0;-><init>(Ljava/util/List;Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;Lcom/angcyo/dsladapter/DslAdapter;)V

    const-wide/16 p0, 0x32

    invoke-virtual {v0, p0, p1, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->postDelay(JLkotlin/jvm/functions/Function0;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final setData$lambda$0$0(Ljava/util/List;Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 9

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/LanguageTranslationData;->getType()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    invoke-virtual {p1}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/X01iXOO00;

    invoke-direct {v2, v0}, Lcom/android/mltcode/paycertificationapi/X01iXOO00;-><init>(Lcom/sma/smartv3/model/LanguageTranslationData;)V

    const v0, 0x7f0d0ef0

    invoke-static {v1, v0, v2}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/iIi0O1X0;

    invoke-direct {v2, v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/iIi0O1X0;-><init>(Lcom/sma/smartv3/model/LanguageTranslationData;Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;Lcom/angcyo/dsladapter/DslAdapter;)V

    const v0, 0x7f0d0eef

    invoke-static {v1, v0, v2}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    goto :goto_0

    :cond_1
    new-instance v6, Lcom/android/mltcode/paycertificationapi/iiXO0Xi;

    invoke-direct {v6}, Lcom/android/mltcode/paycertificationapi/iiXO0Xi;-><init>()V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v3, p2

    invoke-static/range {v3 .. v8}, Lcom/angcyo/dsladapter/DslAdapter;->render$default(Lcom/angcyo/dsladapter/DslAdapter;ZLcom/angcyo/dsladapter/XIi00iiXO;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final setData$lambda$0$0$0(Lcom/sma/smartv3/model/LanguageTranslationData;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iXXO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iXXO;-><init>(Lcom/sma/smartv3/model/LanguageTranslationData;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final setData$lambda$0$0$0$0(Lcom/sma/smartv3/model/LanguageTranslationData;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    const-string p2, "itemHolder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "adapterItem"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "<unused var>"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p2, 0x7f0a0bf7

    invoke-virtual {p1, p2}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final setData$lambda$0$0$1(Lcom/sma/smartv3/model/LanguageTranslationData;Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/III11XI0;

    invoke-direct {v0, p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/III11XI0;-><init>(Lcom/sma/smartv3/model/LanguageTranslationData;Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;Lcom/angcyo/dsladapter/DslAdapter;)V

    invoke-virtual {p3, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final setData$lambda$0$0$1$0(Lcom/sma/smartv3/model/LanguageTranslationData;Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    const-string p4, "itemHolder"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "adapterItem"

    invoke-static {p5, p4}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "<unused var>"

    invoke-static {p6, p4}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p4, 0x7f0a0bf7

    invoke-virtual {p3, p4}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p4

    if-eqz p4, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p4, p5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    const p4, 0x7f0a06b2

    invoke-virtual {p3, p4}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object p4

    invoke-virtual {p1}, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->getMLanguageTranslationData()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object p5

    invoke-virtual {p5}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p0}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object p6

    invoke-static {p5, p6}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p5

    if-eqz p5, :cond_1

    invoke-static {p4}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p5

    invoke-static {p5}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object p5

    const p6, 0x7f080f6e

    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p6

    invoke-virtual {p5, p6}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Integer;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p5

    invoke-virtual {p5, p4}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    goto :goto_0

    :cond_1
    invoke-static {p4}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p5

    invoke-static {p5}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object p5

    const p6, 0x7f080f6f

    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p6

    invoke-virtual {p5, p6}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Integer;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p5

    invoke-virtual {p5, p4}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    :goto_0
    iget-object p3, p3, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    new-instance p5, Lcom/android/mltcode/paycertificationapi/OOXX1XOOX;

    invoke-direct {p5, p1, p0, p4, p2}, Lcom/android/mltcode/paycertificationapi/OOXX1XOOX;-><init>(Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;Lcom/sma/smartv3/model/LanguageTranslationData;Landroid/widget/ImageView;Lcom/angcyo/dsladapter/DslAdapter;)V

    invoke-virtual {p3, p5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 p0, 0x0

    invoke-virtual {p4, p0}, Landroid/widget/ImageView;->setVisibility(I)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final setData$lambda$0$0$1$0$0(Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;Lcom/sma/smartv3/model/LanguageTranslationData;Landroid/widget/ImageView;Lcom/angcyo/dsladapter/DslAdapter;Landroid/view/View;)V
    .locals 1

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->getMLanguageTranslationData()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object p4

    invoke-virtual {p4}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p1}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p4

    if-nez p4, :cond_2

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p4

    invoke-static {p4}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object p4

    const v0, 0x7f080f6e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p4, v0}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Integer;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p4

    invoke-virtual {p4, p2}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->setMLanguageTranslationData(Lcom/sma/smartv3/model/LanguageTranslationData;)V

    invoke-virtual {p3}, Lcom/angcyo/dsladapter/DslAdapter;->notifyDataChanged()V

    iget p2, p0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->mType:I

    const/4 p3, 0x1

    if-eq p2, p3, :cond_1

    const/4 p3, 0x2

    if-ne p2, p3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->putHistoryLanguageList(Lcom/sma/smartv3/model/LanguageTranslationData;)V

    return-void

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->saveListSuccess()V

    return-void

    :cond_2
    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->saveListSuccess()V

    return-void
.end method

.method private static final setData$lambda$0$0$2(Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
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
.method public final getHistoryLanguageList()V
    .locals 5

    const-class v0, Lcom/sma/smartv3/model/LanguageTranslationData;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

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
    check-cast v2, Ljava/util/Collection;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->mHistoryLanguageList:Ljava/util/List;

    return-void
.end method

.method public final getMHistoryLanguageList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/LanguageTranslationData;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->mHistoryLanguageList:Ljava/util/List;

    return-object v0
.end method

.method public final getMLanguageTranslationData()Lcom/sma/smartv3/model/LanguageTranslationData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->mLanguageTranslationData:Lcom/sma/smartv3/model/LanguageTranslationData;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mLanguageTranslationData"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMSearchEdit()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->mSearchEdit$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    return-object v0
.end method

.method public final getMSearchIcon()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->mSearchIcon$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getMType()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->mType:I

    return v0
.end method

.method public final getTextChangedLastTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->textChangedLastTime:J

    return-wide v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->mType:I

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg3()Ljava/io/Serializable;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.sma.smartv3.model.LanguageTranslationData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->setMLanguageTranslationData(Lcom/sma/smartv3/model/LanguageTranslationData;)V

    return-void
.end method

.method public initView()V
    .locals 14

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->initView()V

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f1413b9

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->getMSearchEdit()Landroid/widget/EditText;

    move-result-object v0

    const-string v1, "<get-mSearchEdit>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity$OXO1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity$OXO1;-><init>(Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->getMSearchIcon()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O001;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/O001;-><init>(Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/angcyo/dsladapter/DslAdapter;->getItemSelectorHelper()Lcom/angcyo/dsladapter/ItemSelectorHelper;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity$XIi00iiXO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;)V

    invoke-virtual {v0, v1}, Lcom/angcyo/dsladapter/ItemSelectorHelper;->iX1O1(Lcom/angcyo/dsladapter/iO;)V

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

    return-void
.end method

.method public final isSelectorAll()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->isSelectorAll:Z

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0044

    return v0
.end method

.method public onInitBaseLayoutAfter()V
    .locals 18

    move-object/from16 v0, p0

    invoke-super {v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->onInitBaseLayoutAfter()V

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v1

    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    invoke-direct {v0}, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->getLanguageList()Ljava/util/List;

    move-result-object v1

    iget v2, v0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->mType:I

    const/4 v3, 0x1

    if-eq v2, v3, :cond_4

    const/4 v3, 0x2

    if-ne v2, v3, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {v0}, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->getHistoryLanguageList()V

    invoke-static {}, Lcom/sma/smartv3/model/LanguageTranslationKt;->clearTranslationLanguageList()V

    iget-object v2, v0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->mHistoryLanguageList:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const v3, 0x7f1402c1

    const-string v4, "getString(...)"

    const/4 v5, 0x0

    if-lez v2, :cond_3

    iget-object v2, v0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->mHistoryLanguageList:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v2, v7}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {v7}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v6}, Lkotlin/collections/CollectionsKt___CollectionsKt;->i1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v2

    new-instance v6, Lcom/android/mltcode/paycertificationapi/iXX0OI101;

    invoke-direct {v6, v2}, Lcom/android/mltcode/paycertificationapi/iXX0OI101;-><init>(Ljava/util/Set;)V

    invoke-static {v1, v6}, Lcom/android/mltcode/paycertificationapi/OIXO1IIOO;->iIX0i(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    new-instance v7, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v16, 0x7e

    const/16 v17, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    invoke-direct/range {v7 .. v17}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v5, v7}, Ljava/util/List;->add(ILjava/lang/Object;)V

    iget-object v2, v0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->mHistoryLanguageList:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-interface {v1, v5, v3}, Ljava/util/List;->add(ILjava/lang/Object;)V

    goto :goto_1

    :cond_2
    new-instance v6, Lcom/sma/smartv3/model/LanguageTranslationData;

    const v2, 0x7f1402c2

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v15, 0x7e

    const/16 v16, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x1

    invoke-direct/range {v6 .. v16}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v5, v6}, Ljava/util/List;->add(ILjava/lang/Object;)V

    goto :goto_2

    :cond_3
    new-instance v7, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v16, 0x7e

    const/16 v17, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    invoke-direct/range {v7 .. v17}, Lcom/sma/smartv3/model/LanguageTranslationData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v5, v7}, Ljava/util/List;->add(ILjava/lang/Object;)V

    :cond_4
    :goto_2
    iget-object v2, v0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->mAllLanguageList:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v2, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v1, v0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->mAllLanguageList:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->setData(Ljava/util/List;)V

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

.method public final putHistoryLanguageList(Lcom/sma/smartv3/model/LanguageTranslationData;)V
    .locals 4
    .param p1    # Lcom/sma/smartv3/model/LanguageTranslationData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mLanguageTranslationData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->mHistoryLanguageList:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_2

    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->mHistoryLanguageList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x3

    if-ge v0, v1, :cond_3

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->mHistoryLanguageList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->mHistoryLanguageList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->mHistoryLanguageList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->TAG:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->mHistoryLanguageList:Ljava/util/List;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  putHistoryLanguageList  mHistoryLanguageList = "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "  mLanguageTranslationData = "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->mHistoryLanguageList:Ljava/util/List;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-class v2, Lcom/sma/smartv3/model/LanguageTranslationData;

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

    :goto_2
    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->saveListSuccess()V

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

.method public saveListSuccess()V
    .locals 3

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "language"

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->getMLanguageTranslationData()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    const/4 v1, -0x1

    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final searchName(Ljava/lang/String;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->mAllLanguageList:Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->setData(Ljava/util/List;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->mAllLanguageList:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/LanguageTranslationData;->getName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {v3, p1, v6, v4, v5}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v1}, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->setData(Ljava/util/List;)V

    return-void
.end method

.method public setData(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/LanguageTranslationData;",
            ">;)V"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/android/mltcode/paycertificationapi/OXX0I1IIO;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/OXX0I1IIO;-><init>(Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;Ljava/util/List;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final setMHistoryLanguageList(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/LanguageTranslationData;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->mHistoryLanguageList:Ljava/util/List;

    return-void
.end method

.method public final setMLanguageTranslationData(Lcom/sma/smartv3/model/LanguageTranslationData;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/model/LanguageTranslationData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->mLanguageTranslationData:Lcom/sma/smartv3/model/LanguageTranslationData;

    return-void
.end method

.method public final setMType(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->mType:I

    return-void
.end method

.method public final setSelectorAll(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->isSelectorAll:Z

    return-void
.end method

.method public final setTextChangedLastTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->textChangedLastTime:J

    return-void
.end method
