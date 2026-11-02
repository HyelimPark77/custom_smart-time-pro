.class public final Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;
.super Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSMSQuickReplyActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SMSQuickReplyActivity.kt\ncom/sma/smartv3/ui/device/SMSQuickReplyActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,150:1\n1563#2:151\n1634#2,3:152\n*S KotlinDebug\n*F\n+ 1 SMSQuickReplyActivity.kt\ncom/sma/smartv3/ui/device/SMSQuickReplyActivity\n*L\n62#1:151\n62#1:152,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSMSQuickReplyActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SMSQuickReplyActivity.kt\ncom/sma/smartv3/ui/device/SMSQuickReplyActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,150:1\n1563#2:151\n1634#2,3:152\n*S KotlinDebug\n*F\n+ 1 SMSQuickReplyActivity.kt\ncom/sma/smartv3/ui/device/SMSQuickReplyActivity\n*L\n62#1:151\n62#1:152,3\n*E\n"
    }
.end annotation


# instance fields
.field private final btnBottom$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mEditPop:Lcom/android/mltcode/paycertificationapi/iii1ii;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;",
            ">;"
        }
    .end annotation
.end field

.field private final tvTip$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/nr3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/nr3;-><init>(Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;->tvTip$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/or3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/or3;-><init>(Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;->btnBottom$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;->btnBottom_delegate$lambda$0(Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;I)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;->showList$lambda$0$0$0$0$0$1(Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;I)Z

    move-result p0

    return p0
.end method

.method public static synthetic IIX1OXO(Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;->showList$lambda$0$0(Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;->tvTip_delegate$lambda$0(Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;->onBottomClick$lambda$0$0(Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic X0O(Ljava/util/List;Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;->showList$lambda$0(Ljava/util/List;Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii()Z
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;->showList$lambda$0$0$0$0$0$0()Z

    move-result v0

    return v0
.end method

.method public static synthetic XX0(Lcom/angcyo/dsladapter/DragCallbackHelper;Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;->onInitBaseLayoutAfter$lambda$0$0(Lcom/angcyo/dsladapter/DragCallbackHelper;Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;Ljava/util/List;Ljava/util/List;II)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;->onInitBaseLayoutAfter$lambda$0$1(Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;Ljava/util/List;Ljava/util/List;II)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;->showList$lambda$0$0$0(Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final btnBottom_delegate$lambda$0(Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a01b9

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final checkCount(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const/16 v1, 0x8

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->X00O0()I

    move-result v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const v4, 0x7f141273

    invoke-virtual {p0, v4, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;->getBtnBottom()Landroid/view/View;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-ge p1, v0, :cond_1

    const/4 v2, 0x1

    :cond_1
    invoke-virtual {v1, v2}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method

.method private final getBtnBottom()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;->btnBottom$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getTvTip()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;->tvTip$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;ILandroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;->showList$lambda$0$0$0$0(Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;ILandroid/view/View;)V

    return-void
.end method

.method private static final onBottomClick$lambda$0$0(Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;Ljava/lang/String;)Z
    .locals 4

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;->mList:Ljava/util/List;

    const/4 v1, 0x0

    const-string v2, "mList"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    new-instance v3, Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;

    invoke-direct {v3, p1}, Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;->mList:Ljava/util/List;

    if-nez p1, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, p1

    :goto_0
    invoke-direct {p0, v1}, Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;->showList(Ljava/util/List;)V

    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0(Lcom/angcyo/dsladapter/DragCallbackHelper;Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Lkotlin/Unit;
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/angcyo/dsladapter/DragCallbackHelper;->get_dragHappened()Z

    move-result p0

    if-eqz p0, :cond_1

    iget-object p0, p1, Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;->mList:Ljava/util/List;

    if-nez p0, :cond_0

    const-string p0, "mList"

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_0
    invoke-direct {p1, p0}, Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;->showList(Ljava/util/List;)V

    :cond_1
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$1(Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;Ljava/util/List;Ljava/util/List;II)Lkotlin/Unit;
    .locals 1

    const-string v0, "fromList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "toList"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;->mList:Ljava/util/List;

    const/4 p2, 0x0

    const-string v0, "mList"

    if-nez p1, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, p2

    :cond_0
    invoke-static {p1, p3, p4}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;->mList:Ljava/util/List;

    if-nez p0, :cond_1

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object p2, p0

    :goto_0
    check-cast p2, Ljava/lang/Iterable;

    new-instance p0, Ljava/util/ArrayList;

    const/16 p1, 0xa

    invoke-static {p2, p1}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result p1

    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;

    invoke-virtual {p2}, Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;->getMContent()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p0, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final showList(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v1}, Lcom/angcyo/dsladapter/DslAdapter;->resetItem(Ljava/util/List;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/lr3;

    invoke-direct {v0, p1, p0}, Lcom/android/mltcode/paycertificationapi/lr3;-><init>(Ljava/util/List;Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;->syncList(Ljava/util/List;)V

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;->checkCount(Ljava/util/List;)V

    return-void
.end method

.method private static final showList$lambda$0(Ljava/util/List;Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 3

    const-string v0, "$this$renderAdapter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p2

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p0

    const/4 p1, 0x1

    invoke-static {p0, p1, v1, v0, v1}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p2

    const/4 v2, 0x0

    invoke-static {p2, v2, v1, v0, v1}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    invoke-virtual {p1}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p2

    invoke-virtual {p2, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;

    invoke-virtual {p1}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/hr3;

    invoke-direct {v1, p2, p1}, Lcom/android/mltcode/paycertificationapi/hr3;-><init>(Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;)V

    const p2, 0x7f0d0f1b

    invoke-static {v0, p2, v1}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    goto :goto_0

    :cond_1
    :goto_1
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showList$lambda$0$0(Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/jr3;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/jr3;-><init>(Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;)V

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showList$lambda$0$0$0(Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 1

    const-string v0, "itemHolder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adapterItem"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "<unused var>"

    invoke-static {p5, p4}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p4, 0x7f0a0bf7

    invoke-virtual {p2, p4}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p4

    if-eqz p4, :cond_0

    invoke-virtual {p0}, Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;->getMContent()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p4, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    const p0, 0x7f0a01c9

    invoke-virtual {p2, p0}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object p0

    if-eqz p0, :cond_1

    new-instance p2, Lcom/android/mltcode/paycertificationapi/mr3;

    invoke-direct {p2, p1, p3}, Lcom/android/mltcode/paycertificationapi/mr3;-><init>(Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;I)V

    invoke-virtual {p0, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showList$lambda$0$0$0$0(Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;ILandroid/view/View;)V
    .locals 4

    new-instance p2, Lcom/android/mltcode/paycertificationapi/go0;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {p2, v0, v3, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v0, 0x7f1403e4

    invoke-virtual {p2, v0}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v0, 0x7f14027f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/pr3;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/pr3;-><init>()V

    invoke-virtual {p2, v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/qr3;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/qr3;-><init>(Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;I)V

    const p0, 0x7f1403db

    invoke-virtual {p2, p0, v0}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    const p0, 0x7f0a09b5

    invoke-virtual {p2, p0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->X0O(I)V

    return-void
.end method

.method private static final showList$lambda$0$0$0$0$0$0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method private static final showList$lambda$0$0$0$0$0$1(Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;I)Z
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;->mList:Ljava/util/List;

    const/4 v1, 0x0

    const-string v2, "mList"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;->mList:Ljava/util/List;

    if-nez p1, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, p1

    :goto_0
    invoke-direct {p0, v1}, Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;->showList(Ljava/util/List;)V

    const/4 p0, 0x1

    return p0
.end method

.method private final syncList(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->SMS_QUICK_REPLY_CONTENT:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->RESET:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v3, p1

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendList$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Ljava/util/List;ZZILjava/lang/Object;)Z

    return-void
.end method

.method private static final tvTip_delegate$lambda$0(Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a188f

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
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

.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initView()V
    .locals 9

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->initView()V

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f141272

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/angcyo/dsladapter/DslAdapter;->getDslAdapterStatusItem()Lcom/angcyo/dsladapter/DslAdapterStatusItem;

    move-result-object v0

    invoke-virtual {v0}, Lcom/angcyo/dsladapter/BaseDslStateItem;->getItemStateLayoutMap()Ljava/util/HashMap;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const v2, 0x7f0d0f5a

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v4, Lcom/szabh/smable3/BleKey;->SMS_QUICK_REPLY_CONTENT:Lcom/szabh/smable3/BleKey;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const-class v5, Lcom/szabh/smable3/entity/BleSMSQuickReplyContent;

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/szabh/smable3/component/BaseBleCache;->getList$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;->mList:Ljava/util/List;

    if-nez v0, :cond_0

    const-string v0, "mList"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;->showList(Ljava/util/List;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0109

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

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;->mEditPop:Lcom/android/mltcode/paycertificationapi/iii1ii;

    if-nez p1, :cond_0

    new-instance p1, Lcom/android/mltcode/paycertificationapi/iii1ii;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {p1, v0, v3, v1, v2}, Lcom/android/mltcode/paycertificationapi/iii1ii;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v0, 0x7f141272

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/iii1ii;->XXX11i(I)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/kr3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/kr3;-><init>(Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/iii1ii;->X11iII1O1(Lkotlin/jvm/functions/Function1;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;->mEditPop:Lcom/android/mltcode/paycertificationapi/iii1ii;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;->mEditPop:Lcom/android/mltcode/paycertificationapi/iii1ii;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/iii1ii;->X01IiOiIi()Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f06024d

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    const v0, 0x7f0a09b5

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->X0O(I)V

    :cond_1
    return-void
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

    new-instance v0, Lcom/angcyo/dsladapter/DragCallbackHelper;

    invoke-direct {v0}, Lcom/angcyo/dsladapter/DragCallbackHelper;-><init>()V

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/angcyo/dsladapter/DragCallbackHelper;->setItemDragFlag(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/angcyo/dsladapter/DragCallbackHelper;->attachToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/rr3;

    invoke-direct {v1, v0, p0}, Lcom/android/mltcode/paycertificationapi/rr3;-><init>(Lcom/angcyo/dsladapter/DragCallbackHelper;Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;)V

    invoke-virtual {v0, v1}, Lcom/angcyo/dsladapter/DragCallbackHelper;->setOnClearView(Lkotlin/jvm/functions/Function2;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ir3;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/ir3;-><init>(Lcom/sma/smartv3/ui/device/SMSQuickReplyActivity;)V

    invoke-virtual {v0, v1}, Lcom/angcyo/dsladapter/DragCallbackHelper;->setOnItemMoveChanged(Lkotlin/jvm/functions/Function4;)V

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
