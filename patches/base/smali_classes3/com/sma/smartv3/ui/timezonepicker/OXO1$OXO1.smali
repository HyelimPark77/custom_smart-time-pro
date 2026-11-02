.class public Lcom/sma/smartv3/ui/timezonepicker/OXO1$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/timezonepicker/OXO1;->onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic I1:I

.field public final synthetic IO:Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;

.field public final synthetic iX1O1:Lcom/sma/smartv3/ui/timezonepicker/OXO1;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/timezonepicker/OXO1;Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010,
            0x1010
        }
        names = {
            "this$0",
            "val$item",
            "val$i"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/OXO1$OXO1;->iX1O1:Lcom/sma/smartv3/ui/timezonepicker/OXO1;

    iput-object p2, p0, Lcom/sma/smartv3/ui/timezonepicker/OXO1$OXO1;->IO:Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;

    iput p3, p0, Lcom/sma/smartv3/ui/timezonepicker/OXO1$OXO1;->I1:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "view"
        }
    .end annotation

    iget-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/OXO1$OXO1;->iX1O1:Lcom/sma/smartv3/ui/timezonepicker/OXO1;

    invoke-static {p1}, Lcom/sma/smartv3/ui/timezonepicker/OXO1;->OXO1(Lcom/sma/smartv3/ui/timezonepicker/OXO1;)Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;

    move-result-object p1

    iget p1, p1, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->selectionMode:I

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/OXO1$OXO1;->IO:Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->isSelected()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/OXO1$OXO1;->iX1O1:Lcom/sma/smartv3/ui/timezonepicker/OXO1;

    invoke-static {p1}, Lcom/sma/smartv3/ui/timezonepicker/OXO1;->OXO1(Lcom/sma/smartv3/ui/timezonepicker/OXO1;)Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;

    move-result-object p1

    iget p1, p1, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->maxSelectCount:I

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/OXO1$OXO1;->iX1O1:Lcom/sma/smartv3/ui/timezonepicker/OXO1;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/timezonepicker/OXO1;->XXI()I

    move-result p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/OXO1$OXO1;->iX1O1:Lcom/sma/smartv3/ui/timezonepicker/OXO1;

    invoke-static {v0}, Lcom/sma/smartv3/ui/timezonepicker/OXO1;->OXO1(Lcom/sma/smartv3/ui/timezonepicker/OXO1;)Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;

    move-result-object v0

    iget v0, v0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->maxSelectCount:I

    if-le p1, v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/OXO1$OXO1;->iX1O1:Lcom/sma/smartv3/ui/timezonepicker/OXO1;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/timezonepicker/OXO1;->XXI()I

    move-result p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/OXO1$OXO1;->iX1O1:Lcom/sma/smartv3/ui/timezonepicker/OXO1;

    invoke-static {v0}, Lcom/sma/smartv3/ui/timezonepicker/OXO1;->OXO1(Lcom/sma/smartv3/ui/timezonepicker/OXO1;)Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;

    move-result-object v0

    iget v0, v0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->maxSelectCount:I

    if-ne p1, v0, :cond_3

    iget-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/OXO1$OXO1;->iX1O1:Lcom/sma/smartv3/ui/timezonepicker/OXO1;

    invoke-static {p1}, Lcom/sma/smartv3/ui/timezonepicker/OXO1;->iO(Lcom/sma/smartv3/ui/timezonepicker/OXO1;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/timezonepicker/OXO1$OXO1;->IO:Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->getTimeZoneId()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/sma/smartv3/ui/timezonepicker/OXO1;->OIi0(Lcom/sma/smartv3/ui/timezonepicker/OXO1;Ljava/util/List;Ljava/lang/String;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/OXO1$OXO1;->iX1O1:Lcom/sma/smartv3/ui/timezonepicker/OXO1;

    invoke-static {v0}, Lcom/sma/smartv3/ui/timezonepicker/OXO1;->iO(Lcom/sma/smartv3/ui/timezonepicker/OXO1;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->isSelected()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/OXO1$OXO1;->iX1O1:Lcom/sma/smartv3/ui/timezonepicker/OXO1;

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/OXO1$OXO1;->IO:Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->getCityName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/timezonepicker/OXO1;->X1ii(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    :goto_0
    return-void

    :cond_3
    iget-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/OXO1$OXO1;->iX1O1:Lcom/sma/smartv3/ui/timezonepicker/OXO1;

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/OXO1$OXO1;->IO:Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->getCityName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/timezonepicker/OXO1;->X1ii(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    iget-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/OXO1$OXO1;->iX1O1:Lcom/sma/smartv3/ui/timezonepicker/OXO1;

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/OXO1$OXO1;->IO:Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->getCityName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/timezonepicker/OXO1;->X1ii(Ljava/lang/String;)V

    :goto_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/OXO1$OXO1;->iX1O1:Lcom/sma/smartv3/ui/timezonepicker/OXO1;

    invoke-static {p1}, Lcom/sma/smartv3/ui/timezonepicker/OXO1;->XIi00iiXO(Lcom/sma/smartv3/ui/timezonepicker/OXO1;)Lcom/sma/smartv3/ui/timezonepicker/OXO1$iO;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/OXO1$OXO1;->iX1O1:Lcom/sma/smartv3/ui/timezonepicker/OXO1;

    invoke-static {p1}, Lcom/sma/smartv3/ui/timezonepicker/OXO1;->XIi00iiXO(Lcom/sma/smartv3/ui/timezonepicker/OXO1;)Lcom/sma/smartv3/ui/timezonepicker/OXO1$iO;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/OXO1$OXO1;->iX1O1:Lcom/sma/smartv3/ui/timezonepicker/OXO1;

    iget v1, p0, Lcom/sma/smartv3/ui/timezonepicker/OXO1$OXO1;->I1:I

    invoke-static {v0, v1}, Lcom/sma/smartv3/ui/timezonepicker/OXO1;->I0IIOi(Lcom/sma/smartv3/ui/timezonepicker/OXO1;I)Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/timezonepicker/OXO1$OXO1;->iX1O1:Lcom/sma/smartv3/ui/timezonepicker/OXO1;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/timezonepicker/OXO1;->XXI()I

    move-result v1

    invoke-interface {p1, v0, v1}, Lcom/sma/smartv3/ui/timezonepicker/OXO1$iO;->OXO1(Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;I)V

    :cond_5
    iget-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/OXO1$OXO1;->iX1O1:Lcom/sma/smartv3/ui/timezonepicker/OXO1;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method
