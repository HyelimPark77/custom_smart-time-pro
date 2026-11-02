.class public Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/ui/timezonepicker/OXO1$iO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;I)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "timezone",
            "totalSelectedTimeZones"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;

    invoke-static {v0, p2}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->XiOIii1(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;I)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;

    invoke-static {p2}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->XXI(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;)Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;

    move-result-object p2

    iget p2, p2, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->selectionMode:I

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;

    invoke-static {p1, p2}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->XX0(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;Ljava/util/List;)V

    :cond_0
    return-void
.end method
