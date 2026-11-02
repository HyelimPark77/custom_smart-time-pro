.class public final Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$OXO1;,
        Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$XIi00iiXO;,
        Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$TranslateRecordEarViewHolder;,
        Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$TranslateRecordPhoneViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTranslateMultiDeviceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TranslateMultiDeviceAdapter.kt\ncom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,193:1\n388#2,7:194\n388#2,7:201\n543#2,6:208\n*S KotlinDebug\n*F\n+ 1 TranslateMultiDeviceAdapter.kt\ncom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter\n*L\n61#1:194,7\n71#1:201,7\n85#1:208,6\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTranslateMultiDeviceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TranslateMultiDeviceAdapter.kt\ncom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,193:1\n388#2,7:194\n388#2,7:201\n543#2,6:208\n*S KotlinDebug\n*F\n+ 1 TranslateMultiDeviceAdapter.kt\ncom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter\n*L\n61#1:194,7\n71#1:201,7\n85#1:208,6\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final TYPE_EAR:I = 0x1

.field public static final TYPE_PHONE:I = 0x2


# instance fields
.field private final dataList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/iOIXXXII0;",
            ">;"
        }
    .end annotation
.end field

.field private playListener:Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$XIi00iiXO;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private showTranslation:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->Companion:Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$OXO1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->dataList:Ljava/util/List;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->showTranslation:Z

    return-void
.end method

.method public static final synthetic access$getPlayListener$p(Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;)Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$XIi00iiXO;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->playListener:Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$XIi00iiXO;

    return-object p0
.end method

.method public static final synthetic access$getShowTranslation$p(Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->showTranslation:Z

    return p0
.end method


# virtual methods
.method public final add(Lcom/android/mltcode/paycertificationapi/iOIXXXII0;)V
    .locals 3
    .param p1    # Lcom/android/mltcode/paycertificationapi/iOIXXXII0;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "MultiDeviceAdd "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->dataList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->dataList:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    return-void
.end method

.method public final clear()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->dataList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method

.method public final getDataList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/iOIXXXII0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->dataList:Ljava/util/List;

    return-object v0
.end method

.method public getItemCount()I
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->dataList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->dataList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;->X0O()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hideTranslation()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->showTranslation:Z

    return-void
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 2
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getItemViewType()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    check-cast p1, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$TranslateRecordEarViewHolder;

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->dataList:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$TranslateRecordEarViewHolder;->bind(Lcom/android/mltcode/paycertificationapi/iOIXXXII0;)V

    return-void

    :cond_0
    check-cast p1, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$TranslateRecordPhoneViewHolder;

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->dataList:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$TranslateRecordPhoneViewHolder;->bind(Lcom/android/mltcode/paycertificationapi/iOIXXXII0;)V

    return-void

    :cond_1
    check-cast p1, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$TranslateRecordEarViewHolder;

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->dataList:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$TranslateRecordEarViewHolder;->bind(Lcom/android/mltcode/paycertificationapi/iOIXXXII0;)V

    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 2
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const-string v1, "createViewHolder(...)"

    if-eq p2, v0, :cond_1

    const/4 v0, 0x2

    if-eq p2, v0, :cond_0

    sget-object p2, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$onCreateViewHolder$binding$3;->INSTANCE:Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$onCreateViewHolder$binding$3;

    invoke-static {p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/iXXiX1O1;->OXO1(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function3;)Landroidx/viewbinding/ViewBinding;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/databinding/ItemAuraBinauralLeftBinding;

    new-instance p2, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$TranslateRecordEarViewHolder;

    invoke-direct {p2, p0, p1}, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$TranslateRecordEarViewHolder;-><init>(Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;Lcom/sma/smartv3/databinding/ItemAuraBinauralLeftBinding;)V

    return-object p2

    :cond_0
    sget-object p2, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$onCreateViewHolder$binding$2;->INSTANCE:Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$onCreateViewHolder$binding$2;

    invoke-static {p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/iXXiX1O1;->OXO1(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function3;)Landroidx/viewbinding/ViewBinding;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/databinding/ItemAuraBinauralRightBinding;

    new-instance p2, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$TranslateRecordPhoneViewHolder;

    invoke-direct {p2, p0, p1}, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$TranslateRecordPhoneViewHolder;-><init>(Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;Lcom/sma/smartv3/databinding/ItemAuraBinauralRightBinding;)V

    return-object p2

    :cond_1
    sget-object p2, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$onCreateViewHolder$binding$1;->INSTANCE:Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$onCreateViewHolder$binding$1;

    invoke-static {p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/iXXiX1O1;->OXO1(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function3;)Landroidx/viewbinding/ViewBinding;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/databinding/ItemAuraBinauralLeftBinding;

    new-instance p2, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$TranslateRecordEarViewHolder;

    invoke-direct {p2, p0, p1}, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$TranslateRecordEarViewHolder;-><init>(Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;Lcom/sma/smartv3/databinding/ItemAuraBinauralLeftBinding;)V

    return-object p2
.end method

.method public final setPlayListener(Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$XIi00iiXO;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$XIi00iiXO;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->playListener:Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter$XIi00iiXO;

    return-void
.end method

.method public final submitData(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/iOIXXXII0;",
            ">;)V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->dataList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->dataList:Ljava/util/List;

    check-cast p1, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method

.method public final update(Lcom/android/mltcode/paycertificationapi/iOIXXXII0;)V
    .locals 2
    .param p1    # Lcom/android/mltcode/paycertificationapi/iOIXXXII0;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->dataList:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->dataList:Ljava/util/List;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;->XX0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;->O1O(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;->XiOIii1()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;->iI(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;->OII()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;->iX1O1(Ljava/lang/Integer;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->dataList:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->add(Lcom/android/mltcode/paycertificationapi/iOIXXXII0;)V

    return-void
.end method

.method public final updateAudioPath(Ljava/lang/String;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    if-eqz p1, :cond_4

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->dataList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;->OII()Ljava/lang/Integer;

    move-result-object v3

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ne v3, v2, :cond_1

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    check-cast v1, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;

    if-eqz v1, :cond_4

    invoke-virtual {v1, p1}, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;->iOOX010X(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->dataList:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    sub-int/2addr p1, v2

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    :cond_4
    :goto_2
    return-void
.end method

.method public final updateLastAudioPathByEmpty(Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->dataList:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->dataList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    const/4 v2, -0x1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;->O10IXXX0X()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_0

    :cond_1
    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    move-result v0

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    if-eq v0, v2, :cond_3

    iget-object v1, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->dataList:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;

    invoke-virtual {v1, p1}, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;->iOOX010X(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    :cond_3
    return-void
.end method

.method public final updateLastAudioPathByTTSEnd(Ljava/lang/String;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->dataList:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Adapter update size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " path:"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->dataList:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->dataList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    const/4 v2, -0x1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;->OII()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    move-result v0

    goto :goto_1

    :cond_2
    move v0, v2

    :goto_1
    if-eq v0, v2, :cond_3

    iget-object v1, p0, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->dataList:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;

    invoke-virtual {v1, p1}, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;->iOOX010X(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    :cond_3
    return-void
.end method
