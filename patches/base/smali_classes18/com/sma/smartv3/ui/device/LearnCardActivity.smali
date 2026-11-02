.class public final Lcom/sma/smartv3/ui/device/LearnCardActivity;
.super Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLearnCardActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LearnCardActivity.kt\ncom/sma/smartv3/ui/device/LearnCardActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,315:1\n1869#2:316\n1869#2,2:317\n1870#2:319\n1869#2,2:320\n1869#2,2:341\n173#3,7:322\n180#3,3:330\n143#3,7:333\n183#3:340\n1#4:329\n*S KotlinDebug\n*F\n+ 1 LearnCardActivity.kt\ncom/sma/smartv3/ui/device/LearnCardActivity\n*L\n179#1:316\n184#1:317,2\n179#1:319\n197#1:320,2\n68#1:341,2\n216#1:322,7\n216#1:330,3\n216#1:333,7\n216#1:340\n216#1:329\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLearnCardActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LearnCardActivity.kt\ncom/sma/smartv3/ui/device/LearnCardActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,315:1\n1869#2:316\n1869#2,2:317\n1870#2:319\n1869#2,2:320\n1869#2,2:341\n173#3,7:322\n180#3,3:330\n143#3,7:333\n183#3:340\n1#4:329\n*S KotlinDebug\n*F\n+ 1 LearnCardActivity.kt\ncom/sma/smartv3/ui/device/LearnCardActivity\n*L\n179#1:316\n184#1:317,2\n179#1:319\n197#1:320,2\n68#1:341,2\n216#1:322,7\n216#1:330,3\n216#1:333,7\n216#1:340\n216#1:329\n*E\n"
    }
.end annotation


# instance fields
.field private mHandler111:Landroid/os/Handler;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mTypeFiles:Ljava/util/List;
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

.field private myTask:Ljava/lang/Runnable;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private progress1111:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/LearnCardActivity;->mTypeFiles:Ljava/util/List;

    new-instance v0, Lcom/sma/smartv3/ui/device/LearnCardActivity$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/LearnCardActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/device/LearnCardActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/LearnCardActivity;->myTask:Ljava/lang/Runnable;

    return-void
.end method

.method public static synthetic X0i1O(Lcom/sma/smartv3/model/LearnCardItemList;Lcom/sma/smartv3/model/LearnCardDataItem;Lcom/sma/smartv3/ui/device/LearnCardActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/LearnCardActivity;->showList$lambda$0$1(Lcom/sma/smartv3/model/LearnCardItemList;Lcom/sma/smartv3/model/LearnCardDataItem;Lcom/sma/smartv3/ui/device/LearnCardActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X11iII1O1(Lcom/sma/smartv3/model/LearnCardDataItem;Lcom/sma/smartv3/ui/device/LearnCardActivity;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/device/LearnCardActivity;->showList$lambda$0$1$0(Lcom/sma/smartv3/model/LearnCardDataItem;Lcom/sma/smartv3/ui/device/LearnCardActivity;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1IX(Lcom/sma/smartv3/model/LearnCardItemList;Landroid/widget/ImageView;Lcom/sma/smartv3/ui/device/LearnCardActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/LearnCardActivity;->showList$lambda$0$0$0$0(Lcom/sma/smartv3/model/LearnCardItemList;Landroid/widget/ImageView;Lcom/sma/smartv3/ui/device/LearnCardActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XXIIO1i11(Lcom/angcyo/dsladapter/DslAdapterItem;Landroid/widget/ImageView;Lcom/sma/smartv3/ui/device/LearnCardActivity;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/device/LearnCardActivity;->showList$lambda$0$0$0$1(Lcom/angcyo/dsladapter/DslAdapterItem;Landroid/widget/ImageView;Lcom/sma/smartv3/ui/device/LearnCardActivity;Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XXX11i(Lcom/sma/smartv3/model/LearnCardItemList;Lcom/sma/smartv3/ui/device/LearnCardActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/LearnCardActivity;->showList$lambda$0$0(Lcom/sma/smartv3/model/LearnCardItemList;Lcom/sma/smartv3/ui/device/LearnCardActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMHandler111$p(Lcom/sma/smartv3/ui/device/LearnCardActivity;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/LearnCardActivity;->mHandler111:Landroid/os/Handler;

    return-object p0
.end method

.method public static synthetic iI(Lcom/sma/smartv3/model/LearnCardDataItem;Lcom/sma/smartv3/ui/device/LearnCardActivity;Landroid/widget/ImageView;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/LearnCardActivity;->showList$lambda$0$1$0$0(Lcom/sma/smartv3/model/LearnCardDataItem;Lcom/sma/smartv3/ui/device/LearnCardActivity;Landroid/widget/ImageView;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic iIXi1iiXI(Lcom/sma/smartv3/ui/device/LearnCardActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/LearnCardActivity;->showList$lambda$0(Lcom/sma/smartv3/ui/device/LearnCardActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iX1O1(Lcom/sma/smartv3/model/LearnCardItemList;Lcom/sma/smartv3/ui/device/LearnCardActivity;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/sma/smartv3/ui/device/LearnCardActivity;->showList$lambda$0$0$0(Lcom/sma/smartv3/model/LearnCardItemList;Lcom/sma/smartv3/ui/device/LearnCardActivity;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final showList$lambda$0(Lcom/sma/smartv3/ui/device/LearnCardActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 5

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/LearnCardActivity;->mTypeFiles:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/LearnCardItemList;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/LearnCardItemList;->getList()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/sl;

    invoke-direct {v2, v0, p0}, Lcom/android/mltcode/paycertificationapi/sl;-><init>(Lcom/sma/smartv3/model/LearnCardItemList;Lcom/sma/smartv3/ui/device/LearnCardActivity;)V

    const v3, 0x7f0d0eed

    invoke-static {v1, v3, v2}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    :cond_1
    invoke-virtual {v0}, Lcom/sma/smartv3/model/LearnCardItemList;->getList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/model/LearnCardDataItem;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v3

    new-instance v4, Lcom/android/mltcode/paycertificationapi/tl;

    invoke-direct {v4, v0, v2, p0}, Lcom/android/mltcode/paycertificationapi/tl;-><init>(Lcom/sma/smartv3/model/LearnCardItemList;Lcom/sma/smartv3/model/LearnCardDataItem;Lcom/sma/smartv3/ui/device/LearnCardActivity;)V

    const v2, 0x7f0d0eee

    invoke-static {v3, v2, v4}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    goto :goto_0

    :cond_2
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showList$lambda$0$0(Lcom/sma/smartv3/model/LearnCardItemList;Lcom/sma/smartv3/ui/device/LearnCardActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$dslItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemIsGroupHead(Z)V

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemIsHover(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/model/LearnCardItemList;->getTypeName()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p2, v1}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemGroups(Ljava/util/List;)V

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemGroupExtend(Z)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ql;

    invoke-direct {v0, p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/ql;-><init>(Lcom/sma/smartv3/model/LearnCardItemList;Lcom/sma/smartv3/ui/device/LearnCardActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)V

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/model/LearnCardItemList;->getTypeName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemTag(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showList$lambda$0$0$0(Lcom/sma/smartv3/model/LearnCardItemList;Lcom/sma/smartv3/ui/device/LearnCardActivity;Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 1

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

    move-result-object p5

    invoke-interface {p5}, Ljava/util/List;->size()I

    move-result p5

    const p6, 0x7f140e01

    invoke-virtual {p1, p6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p4, p5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    const p4, 0x7f0a0690

    invoke-virtual {p3, p4}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p4

    const p5, 0x7f0a068f

    invoke-virtual {p3, p5}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p5

    check-cast p5, Landroid/widget/ImageView;

    if-eqz p4, :cond_3

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getOpenDeleteType()Z

    move-result p6

    if-eqz p6, :cond_2

    iget-object p6, p3, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/vl;

    invoke-direct {v0, p0, p5, p1}, Lcom/android/mltcode/paycertificationapi/vl;-><init>(Lcom/sma/smartv3/model/LearnCardItemList;Landroid/widget/ImageView;Lcom/sma/smartv3/ui/device/LearnCardActivity;)V

    invoke-virtual {p6, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 p0, 0x0

    goto :goto_0

    :cond_2
    const/16 p0, 0x8

    :goto_0
    invoke-virtual {p4, p0}, Landroid/view/View;->setVisibility(I)V

    :cond_3
    const p0, 0x7f0a0691

    invoke-virtual {p3, p0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    if-eqz p0, :cond_5

    invoke-virtual {p2}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemGroupExtend()Z

    move-result p3

    if-eqz p3, :cond_4

    const p3, 0x7f081425

    goto :goto_1

    :cond_4
    const p3, 0x7f081426

    :goto_1
    invoke-virtual {p0, p3}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_5
    if-eqz p0, :cond_6

    new-instance p3, Lcom/android/mltcode/paycertificationapi/wl;

    invoke-direct {p3, p2, p0, p1, p4}, Lcom/android/mltcode/paycertificationapi/wl;-><init>(Lcom/angcyo/dsladapter/DslAdapterItem;Landroid/widget/ImageView;Lcom/sma/smartv3/ui/device/LearnCardActivity;Landroid/view/View;)V

    invoke-virtual {p0, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_6
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showList$lambda$0$0$0$0(Lcom/sma/smartv3/model/LearnCardItemList;Landroid/widget/ImageView;Lcom/sma/smartv3/ui/device/LearnCardActivity;Landroid/view/View;)V
    .locals 1

    invoke-virtual {p0}, Lcom/sma/smartv3/model/LearnCardItemList;->isAllChoose()Z

    move-result p3

    xor-int/lit8 p3, p3, 0x1

    invoke-virtual {p0, p3}, Lcom/sma/smartv3/model/LearnCardItemList;->setAllChoose(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/model/LearnCardItemList;->isAllChoose()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object p3

    const v0, 0x7f080711

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Integer;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p3

    invoke-virtual {p3, p1}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object p3

    const v0, 0x7f080712

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Integer;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p3

    invoke-virtual {p3, p1}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    :goto_0
    invoke-virtual {p0}, Lcom/sma/smartv3/model/LearnCardItemList;->getList()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/sma/smartv3/model/LearnCardDataItem;

    invoke-virtual {p3}, Lcom/sma/smartv3/model/LearnCardDataItem;->isChoose()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getDeleteNum()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p2, v0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->setDeleteNum(I)V

    goto :goto_2

    :cond_1
    invoke-virtual {p2}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getDeleteNum()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p2, v0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->setDeleteNum(I)V

    :goto_2
    invoke-virtual {p0}, Lcom/sma/smartv3/model/LearnCardItemList;->isAllChoose()Z

    move-result v0

    invoke-virtual {p3, v0}, Lcom/sma/smartv3/model/LearnCardDataItem;->setChoose(Z)V

    goto :goto_1

    :cond_2
    invoke-virtual {p2}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getDeleteNum()I

    move-result p0

    invoke-virtual {p2, p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->changeDeleteBtnText(I)V

    invoke-virtual {p2}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p0

    invoke-virtual {p0}, Lcom/angcyo/dsladapter/DslAdapter;->notifyDataChanged()V

    return-void
.end method

.method private static final showList$lambda$0$0$0$1(Lcom/angcyo/dsladapter/DslAdapterItem;Landroid/widget/ImageView;Lcom/sma/smartv3/ui/device/LearnCardActivity;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemGroupExtend()Z

    move-result p4

    xor-int/lit8 p4, p4, 0x1

    invoke-virtual {p0, p4}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemGroupExtend(Z)V

    invoke-virtual {p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemGroupExtend()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getOpenDeleteType()Z

    move-result p0

    if-eqz p0, :cond_0

    if-eqz p3, :cond_0

    const/4 p0, 0x0

    invoke-virtual {p3, p0}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    const p0, 0x7f081425

    goto :goto_0

    :cond_1
    if-eqz p3, :cond_2

    const/16 p0, 0x8

    invoke-virtual {p3, p0}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    const p0, 0x7f081426

    :goto_0
    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method private static final showList$lambda$0$1(Lcom/sma/smartv3/model/LearnCardItemList;Lcom/sma/smartv3/model/LearnCardDataItem;Lcom/sma/smartv3/ui/device/LearnCardActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/model/LearnCardItemList;->getTypeName()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {p3, p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemGroups(Ljava/util/List;)V

    new-instance p0, Lcom/android/mltcode/paycertificationapi/ul;

    invoke-direct {p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/ul;-><init>(Lcom/sma/smartv3/model/LearnCardDataItem;Lcom/sma/smartv3/ui/device/LearnCardActivity;)V

    invoke-virtual {p3, p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showList$lambda$0$1$0(Lcom/sma/smartv3/model/LearnCardDataItem;Lcom/sma/smartv3/ui/device/LearnCardActivity;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    const-string p3, "itemHolder"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "adapterItem"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "payloads"

    invoke-static {p5, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0a05fc

    invoke-virtual {p2, p3}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/model/LearnCardDataItem;->getPath()I

    move-result p4

    invoke-virtual {p3, p4}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_0
    const p3, 0x7f0a0bf7

    invoke-virtual {p2, p3}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p3

    if-eqz p3, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/model/LearnCardDataItem;->getName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    const p3, 0x7f0a00e5

    invoke-virtual {p2, p3}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p3

    if-eqz p3, :cond_2

    const-string p4, ""

    invoke-virtual {p3, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    const p3, 0x7f0a06b2

    invoke-virtual {p2, p3}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object p3

    invoke-virtual {p0}, Lcom/sma/smartv3/model/LearnCardDataItem;->isChoose()Z

    move-result p4

    if-eqz p4, :cond_3

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p4

    invoke-static {p4}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object p4

    const p5, 0x7f080711

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p5

    invoke-virtual {p4, p5}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Integer;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p4

    invoke-virtual {p4, p3}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    goto :goto_0

    :cond_3
    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p4

    invoke-static {p4}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object p4

    const p5, 0x7f080712

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p5

    invoke-virtual {p4, p5}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Integer;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p4

    invoke-virtual {p4, p3}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    :goto_0
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getOpenDeleteType()Z

    move-result p4

    if-eqz p4, :cond_4

    iget-object p2, p2, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    new-instance p4, Lcom/android/mltcode/paycertificationapi/rl;

    invoke-direct {p4, p0, p1, p3}, Lcom/android/mltcode/paycertificationapi/rl;-><init>(Lcom/sma/smartv3/model/LearnCardDataItem;Lcom/sma/smartv3/ui/device/LearnCardActivity;Landroid/widget/ImageView;)V

    invoke-virtual {p2, p4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 p0, 0x0

    goto :goto_1

    :cond_4
    const/16 p0, 0x8

    :goto_1
    invoke-virtual {p3, p0}, Landroid/widget/ImageView;->setVisibility(I)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showList$lambda$0$1$0$0(Lcom/sma/smartv3/model/LearnCardDataItem;Lcom/sma/smartv3/ui/device/LearnCardActivity;Landroid/widget/ImageView;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/model/LearnCardDataItem;->isChoose()Z

    move-result p3

    xor-int/lit8 p3, p3, 0x1

    invoke-virtual {p0, p3}, Lcom/sma/smartv3/model/LearnCardDataItem;->setChoose(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/model/LearnCardDataItem;->isChoose()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getDeleteNum()I

    move-result p3

    add-int/lit8 p3, p3, 0x1

    invoke-virtual {p1, p3}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->setDeleteNum(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getDeleteNum()I

    move-result p3

    add-int/lit8 p3, p3, -0x1

    invoke-virtual {p1, p3}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->setDeleteNum(I)V

    :goto_0
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getDeleteNum()I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->changeDeleteBtnText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/model/LearnCardDataItem;->isChoose()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object p0

    const p1, 0x7f080711

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Integer;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void

    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object p0

    const p1, 0x7f080712

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Integer;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void
.end method


# virtual methods
.method public allSelect(Z)V
    .locals 3

    invoke-super {p0, p1}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->allSelect(Z)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->setDeleteNum(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/LearnCardActivity;->mTypeFiles:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/LearnCardItemList;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->isAllSelect()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/model/LearnCardItemList;->setAllChoose(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->isAllSelect()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getDeleteNum()I

    move-result v1

    invoke-virtual {v0}, Lcom/sma/smartv3/model/LearnCardItemList;->getList()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->setDeleteNum(I)V

    :cond_1
    invoke-virtual {v0}, Lcom/sma/smartv3/model/LearnCardItemList;->getList()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/model/LearnCardDataItem;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->isAllSelect()Z

    move-result v2

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/model/LearnCardDataItem;->setChoose(Z)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getOpenDeleteType()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getDeleteNum()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->changeDeleteBtnText(I)V

    :cond_3
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p1

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapter;->notifyDataChanged()V

    return-void
.end method

.method public confirmDeleteFile()V
    .locals 3

    invoke-super {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->confirmDeleteFile()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/LearnCardActivity;->mTypeFiles:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/model/LearnCardItemList;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/LearnCardItemList;->getList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/model/LearnCardDataItem;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/LearnCardDataItem;->isChoose()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/LearnCardActivity;->showList()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->setOpenDeleteType(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->changeActivityState()V

    return-void
.end method

.method public getFile()V
    .locals 3

    invoke-super {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getFile()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getTvFreeSpace()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "mArg0"

    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mArg1"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "mArg2"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "mArg3"

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance v0, Landroid/content/Intent;

    const-class v2, Lcom/sma/smartv3/ui/device/OnLineLearningFileActivity;

    invoke-direct {v0, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    const/16 v1, 0xff

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public final getMTypeFiles()Ljava/util/List;
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

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/LearnCardActivity;->mTypeFiles:Ljava/util/List;

    return-object v0
.end method

.method public final getMyTask()Ljava/lang/Runnable;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/LearnCardActivity;->myTask:Ljava/lang/Runnable;

    return-object v0
.end method

.method public final getProgress1111()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/device/LearnCardActivity;->progress1111:I

    return v0
.end method

.method public initView()V
    .locals 2

    invoke-super {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->initView()V

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f140d41

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0034

    return v0
.end method

.method public final mTask()V
    .locals 4

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getTvProgressTip()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f1413a9

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getTvName()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f1414b7

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getTvTotalProgress()Landroid/widget/TextView;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getPbProgress()Landroid/widget/ProgressBar;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/ui/device/LearnCardActivity;->progress1111:I

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getTvProgress()Landroid/widget/TextView;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/ui/device/LearnCardActivity;->progress1111:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "%"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget v0, p0, Lcom/sma/smartv3/ui/device/LearnCardActivity;->progress1111:I

    const/16 v1, 0x64

    if-le v0, v1, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getTaskPanel()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getRecyclerViewTitle()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getRightBtn()Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/LearnCardActivity;->mHandler111:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    :cond_0
    iput-object v1, p0, Lcom/sma/smartv3/ui/device/LearnCardActivity;->mHandler111:Landroid/os/Handler;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/LearnCardActivity;->showList()V

    :cond_1
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget v1, p0, Lcom/sma/smartv3/ui/device/LearnCardActivity;->progress1111:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mTask  ---------- >  progress = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2
    .param p3    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/16 p3, 0xff

    if-ne p1, p3, :cond_1

    const/4 p1, -0x1

    if-ne p2, p1, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/LearnCardActivity;->mHandler111:Landroid/os/Handler;

    if-nez p1, :cond_0

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/LearnCardActivity;->mHandler111:Landroid/os/Handler;

    :cond_0
    const/4 p1, 0x0

    iput p1, p0, Lcom/sma/smartv3/ui/device/LearnCardActivity;->progress1111:I

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getTaskPanel()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p2

    const/16 p3, 0x8

    invoke-virtual {p2, p3}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getTvProgressTip()Landroid/widget/TextView;

    move-result-object p2

    const v0, 0x7f1412dd

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getRightBtn()Landroid/widget/Button;

    move-result-object p2

    invoke-virtual {p2, p3}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getRecyclerViewTitle()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, p3}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getTvCancel()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getTvRetry()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p3}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/LearnCardActivity;->mHandler111:Landroid/os/Handler;

    if-eqz p1, :cond_1

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/LearnCardActivity;->myTask:Ljava/lang/Runnable;

    const-wide/16 v0, 0x28

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    return-void
.end method

.method public final onBottomClick(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->getOpenDeleteType()Z

    move-result p1

    if-eqz p1, :cond_0

    const p1, 0x7f140178

    const v0, 0x7f14017a

    const v1, 0x7f14017b

    invoke-virtual {p0, v1, p1, v0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->showDeleteTipPopup(III)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/LearnCardActivity;->getFile()V

    return-void
.end method

.method public onInitBaseLayoutAfter()V
    .locals 4

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->onInitBaseLayoutAfter()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    const/4 v2, 0x3

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;-><init>(II)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/LearnCardActivity;->showList()V

    return-void
.end method

.method public final setMyTask(Ljava/lang/Runnable;)V
    .locals 1
    .param p1    # Ljava/lang/Runnable;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/LearnCardActivity;->myTask:Ljava/lang/Runnable;

    return-void
.end method

.method public final setProgress1111(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/LearnCardActivity;->progress1111:I

    return-void
.end method

.method public showList()V
    .locals 2

    invoke-super {p0}, Lcom/sma/smartv3/ui/device/BaseJLFileManageActivity;->showList()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v1}, Lcom/angcyo/dsladapter/DslAdapter;->resetItem(Ljava/util/List;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/pl;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/pl;-><init>(Lcom/sma/smartv3/ui/device/LearnCardActivity;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
