.class public final Lcom/sma/smartv3/ui/device/ContactListV2Activity$iO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/view/ContactSideBar$XIi00iiXO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/ContactListV2Activity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nContactListV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContactListV2Activity.kt\ncom/sma/smartv3/ui/device/ContactListV2Activity$initView$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,442:1\n1878#2,3:443\n*S KotlinDebug\n*F\n+ 1 ContactListV2Activity.kt\ncom/sma/smartv3/ui/device/ContactListV2Activity$initView$1\n*L\n273#1:443,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nContactListV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContactListV2Activity.kt\ncom/sma/smartv3/ui/device/ContactListV2Activity$initView$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,442:1\n1878#2,3:443\n*S KotlinDebug\n*F\n+ 1 ContactListV2Activity.kt\ncom/sma/smartv3/ui/device/ContactListV2Activity$initView$1\n*L\n273#1:443,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/ContactListV2Activity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/ContactListV2Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/ContactListV2Activity$iO;->OXO1:Lcom/sma/smartv3/ui/device/ContactListV2Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/String;)V
    .locals 6

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ContactListV2Activity$iO;->OXO1:Lcom/sma/smartv3/ui/device/ContactListV2Activity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/ContactListV2Activity;->access$getTipBars$p(Lcom/sma/smartv3/ui/device/ContactListV2Activity;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ContactListV2Activity$iO;->OXO1:Lcom/sma/smartv3/ui/device/ContactListV2Activity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/ContactListV2Activity;->access$getMList$p(Lcom/sma/smartv3/ui/device/ContactListV2Activity;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/ContactListV2Activity$iO;->OXO1:Lcom/sma/smartv3/ui/device/ContactListV2Activity;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    if-gez v2, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_0
    check-cast v3, Lcom/sma/smartv3/ui/contactpicker/ContactResult;

    invoke-virtual {v3}, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->getItemGroups()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/ContactListV2Activity;->access$getTipBars$p(Lcom/sma/smartv3/ui/device/ContactListV2Activity;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v3

    const/4 v5, -0x1

    if-le v3, v5, :cond_1

    invoke-virtual {v1}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/ContactListV2Activity;->access$getTipBars$p(Lcom/sma/smartv3/ui/device/ContactListV2Activity;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr v2, p1

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    return-void

    :cond_1
    move v2, v4

    goto :goto_0

    :cond_2
    return-void
.end method
