.class public final Lcom/sma/smartv3/ui/sport/SportListActivity$setHotListView$1;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/SportListActivity;->setHotListView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/ui/sport/SportListActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/sport/SportListActivity;Landroid/app/Activity;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/sport/SportListActivity;",
            "Landroid/app/Activity;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportListActivity$setHotListView$1;->this$0:Lcom/sma/smartv3/ui/sport/SportListActivity;

    const p1, 0x7f0d1064

    invoke-direct {p0, p2, p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method


# virtual methods
.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;II)V
    .locals 2

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportListActivity$setHotListView$1;->this$0:Lcom/sma/smartv3/ui/sport/SportListActivity;

    const/4 v1, 0x1

    invoke-static {v0, p1, p2, p3, v1}, Lcom/sma/smartv3/ui/sport/SportListActivity;->access$setViewHolder(Lcom/sma/smartv3/ui/sport/SportListActivity;Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;IIZ)V

    return-void
.end method

.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/sport/SportListActivity$setHotListView$1;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;II)V

    return-void
.end method
