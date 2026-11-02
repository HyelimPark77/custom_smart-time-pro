.class public interface abstract Lcom/sma/smartv3/view/CalendarView$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/view/CalendarView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "OXO1"
.end annotation


# virtual methods
.method public abstract onDateSelected(Ljava/util/Calendar;III)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "calendar",
            "year",
            "month",
            "day"
        }
    .end annotation
.end method

.method public abstract onInteractivePrompts(Ljava/lang/String;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "msg"
        }
    .end annotation
.end method

.method public abstract onMonthChange(Ljava/util/Calendar;III)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "calendar",
            "year",
            "month",
            "day"
        }
    .end annotation
.end method
