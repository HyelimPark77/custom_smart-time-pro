.class public Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;


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

    iput-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "view"
        }
    .end annotation

    iget-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->OIX0iXi(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;)Lcom/sma/smartv3/ui/timezonepicker/OXO1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/timezonepicker/OXO1;->I0iXXO()Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;->XX0(Lcom/sma/smartv3/ui/timezonepicker/TimeZonePickerActivity;Ljava/util/List;)V

    return-void
.end method
